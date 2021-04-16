package exercise;

public class Main {
  public static void main(String[] args) {
    ProductCatalogue catalogue = new ProductCatalogue();
    // test data
    catalogue.addProduct(new ProductSpecification("Book1", 200, 1));
    catalogue.addProduct(new ProductSpecification("Book2", 300, 2));

    // Start up cash register with product catalogue
    Register register = new Register(catalogue);
    register.run();
  }
}
