package exercise;

// Controller class
public class Register {

    private UI ui = new UI();
    private ProductCatalogue catalogue;
    private Sale currentSale;

    public Register(ProductCatalogue catalogue) {
        this.catalogue = catalogue;
    }

    public void run() {
        int choice = 0;
        while (true) {
            ui.printMenu();
            choice = ui.getMenuOption();

            switch (choice) {
                case 1:
                    makeNewSale();
                    break;
                case 2:
                    enterItem();
                    break;
                case 3:
                    endSale();
                    break;
                case 9:
                    System.exit(0);
            }
        }
    }

    public void makeNewSale() {
        currentSale = new Sale();
    }

    public void enterItem() {
        int id = ui.getInt("Enter id ");
        int qty = ui.getInt("Enter quantity ");
        ProductSpecification product = catalogue.getProductDescription(id);
        currentSale.makeLineItem(qty, product);
    }

    public void endSale() {
        currentSale.becomeComplete();
        ui.printReceipt(currentSale);

    }

}
