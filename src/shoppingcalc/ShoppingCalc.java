package shoppingcalc;

import java.util.*;

/*
 * 24.03.2022
 * @author logan
 * 2215067
 */
public class ShoppingCalc {

    public static void main(String[] args) {

        double price1, price2, price3, price4, price5, total;

        Scanner kbd = new Scanner(System.in);
        kbd.useLocale(Locale.ENGLISH);

        System.out.print("Enter the name of the First item you want to buy: ");
        String item1 = kbd.nextLine();
        System.out.print("Enter the price of the First item: R");
        price1 = kbd.nextDouble();

        System.out.print("Enter the name of the Second item you want to buy: ");
        String item2 = kbd.nextLine();
        item2 = kbd.nextLine();
        System.out.print("Enter the price of the Second item: R");
        price2 = kbd.nextDouble();

        System.out.print("Enter the name of the Thrid item you want to buy: ");
        String item3 = kbd.nextLine();
        item3 = kbd.nextLine();
        System.out.print("Enter the price of the Thrid item: R");
        price3 = kbd.nextDouble();

        System.out.print("Enter the name of the Fourth item you want to buy: ");
        String item4 = kbd.nextLine();
        item4 = kbd.nextLine();
        System.out.print("Enter the price of the Fourth item: R");
        price4 = kbd.nextDouble();

        System.out.print("Enter the name of the Fifth item you want to buy: ");
        String item5 = kbd.nextLine();
        item5 = kbd.nextLine();
        System.out.print("Enter the price of the Fifth item: R");
        price5 = kbd.nextDouble();
        kbd.nextLine();
        
        total = price1 + price2 + price3 + price4 + price5;

        System.out.println("================================================");
        System.out.println("You have selected to buy the following items:");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Item: " + item1 + " at R" + price1);
        System.out.println("Item: " + item2 + " at R" + price2);
        System.out.println("Item: " + item3 + " at R" + price3);
        System.out.println("Item: " + item4 + " at R" + price4);
        System.out.println("Item: " + item5 + " at R" + price5);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Total for all items: R" + total);
        
        kbd.close();
    }

}
