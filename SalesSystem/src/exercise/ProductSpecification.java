package exercise;

public class ProductSpecification {
  private String description;
  private int price;
  private int id;

  public ProductSpecification(String description, int price, int id) {
    this.description = description;
    this.price = price;
    this.id = id;
  }

  public int getPrice() {
    return price;
  }

  public String getDescription() {
    return description;
  }

  public int getId() {
    return id;
  }

  @Override
  public String toString() {
    return "Description: " + description +
        "\nprice: " + price +
        "\nid: " + id;
  }
}
