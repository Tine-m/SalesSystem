package exercise;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    private Scanner scan = new Scanner(System.in);

    public void printMenu() {
        System.out.println("Main menu - Exit with 9");
        System.out.println("1. Enter sale");
        System.out.println("2. Register item");
        System.out.println("3. End sale");
        System.out.print("Enter choice: ");
    }

    public int getMenuOption() {
        int choice = 0;
        while (!scan.hasNextInt()) {
            System.out.println("\nYou must enter number!");
            System.out.print("Enter choice: ");
            scan.nextLine();
        }
        choice = scan.nextInt();
        return choice;
    }

    public int getInt(String message) {
        System.out.print(message);
        return scan.nextInt();
    }

    public void printReceipt(Sale sale) {
        System.out.println("*** Invoice ***");
        LocalDateTime time = sale.getTimeOfSale();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        System.out.println("Date: " + time.format(fmt));
        ArrayList<SaleLineItem> itemLines = sale.getSalesList();

        for (int i = 0; i < itemLines.size(); i++) {
            System.out.println(itemLines.get(i) + " " + '\t' + itemLines.get(i).subTotal());
        }

        System.out.println("Grand total " + sale.grandTotal());
    }
}
