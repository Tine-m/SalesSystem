package exercise;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Sale {
  private final LocalDateTime timeOfSale = LocalDateTime.now();
  private ArrayList<SaleLineItem> salesList = new ArrayList<>();
  private boolean isComplete = false;

  public void addSalesItem(SaleLineItem saleLineItem) {
    salesList.add(saleLineItem);
  }

  public void makeLineItem(int quant, ProductSpecification productSpecification){
    SaleLineItem salesLine = new SaleLineItem(quant, productSpecification);
    salesList.add(salesLine);
  }

  public int grandTotal(){
    int total = 0;
    for (int i = 0; i < salesList.size(); i++) {
      total += salesList.get(i).subTotal();
    }
    return total;
  }

  public void becomeComplete() {
    isComplete = true;
  }

  public LocalDateTime getTimeOfSale() {
    return timeOfSale;
  }

  public ArrayList<SaleLineItem> getSalesList() {
    return salesList;
  }

  @Override
  public String toString() {
    String output = "[";
    for (int i = 0; i < salesList.size(); i++) {
      output += salesList.get(i);
    }
    return "timeOfSale: " + timeOfSale + " " + output + "]";
  }
}


