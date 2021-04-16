package exercise;

public class SaleLineItem {
  private int quantity;
  private ProductSpecification product;

  public SaleLineItem(int quantity, ProductSpecification product){
    this.quantity = quantity;
    this.product = product;
  }

  public int subTotal(){
    int subTotal = product.getPrice() * quantity;
    return subTotal;
  }

  @Override
  public String toString() {
    return "Product: " + product.getDescription() +
        "\tQty: " + quantity;
  }
}
