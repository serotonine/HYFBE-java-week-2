package exercices;
/*
*  Shopping Cart (Array of Objects)
* Concepts used: Classes, objects, arrays, methods.
*
* Create a Product class with fields: name, price, quantity.
* Store 5 products in an array.
* Write a method calculateTotal() that returns the total price of all products in the cart.
* Print the bill with product details and the total.
*/

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class ShoppingCart {

    public static void main(String[]args) {
        float total = 0f;
        Product[] myShopping = new Product[5];
        // Use Arrays.fill.
        Arrays.fill(myShopping, 0,1,new Product("slip Le Slip Français", 10.99f, 4));
        myShopping[1] = new Product("Socks Dim", 15.50f, 8);
        myShopping[2] = new Product("Scarf Hermes", 150f, 1);
        myShopping[3] = new Product("Trousers Levi's Strauss", 156f, 2);
        myShopping[4] = new Product("Wool Pull over", 249.99f, 1);
        // Print table.
        int nameLg =  0;
        int priceLg = 0;
        int qtLg = 0;
        int subTotalLg = 0;
        int moreSp = 4;
        NumberFormat frFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        // Spaces calc.
        for (Product product:myShopping) {
            nameLg =  Math.max(nameLg,product.name.length());
            priceLg = Math.max(priceLg,String.format("%.2f",product.price).length());
            qtLg =  Math.max(qtLg,String.format("%d",product.quantity).length());
            subTotalLg =  Math.max(subTotalLg,String.format("%.2f",product.calculateSubTotal()).length());
        }
        int totalLg = nameLg + priceLg + qtLg + subTotalLg + (moreSp *5);
        int billLg = totalLg / 2 - "BILL".length();

        // Print bill. //
        // Header.
        System.out.println("=".repeat( billLg) + "  BILL  " + "=".repeat( billLg));
        System.out.print("–".repeat(nameLg / 2 - "Name".length() + 3) + " Name " + "–".repeat(nameLg / 2 - "Name".length() +3));
        System.out.print("–".repeat(priceLg / 2) + " Price " + "–".repeat(priceLg / 2 ));
        System.out.print("–".repeat(qtLg / 2 +1 ) + " Qt " + "–".repeat(qtLg / 2 +1 ));
        System.out.println("–".repeat(subTotalLg / 2 ) + " Subtotal" );
        // Body
        for (int i= 0; i < myShopping.length; i++) {
            // Increments total.
            float subTotal = myShopping[i].calculateSubTotal();
            total += subTotal;
            // Products
            System.out.print(String.format("%-" + (nameLg + moreSp) + "s", myShopping[i].name));
            System.out.print(String.format("%" + (priceLg + moreSp) + "s",  frFormat.format(myShopping[i].price) ));
            System.out.print(String.format("%" + (qtLg + moreSp) + "s", myShopping[i].quantity));
            System.out.println(String.format("%" + (subTotalLg + (moreSp*2)) + "s",frFormat.format(subTotal)));
        }
        // Footer
        String _total = "Total: " + frFormat.format(total);
        System.out.println("\n" + String.format("%" + (totalLg) + "s",_total ));
    }
}
class Product{
    String name;
    float price;
    int quantity;
    Product(String name, float price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public float calculateSubTotal(){
        return price * quantity;
    }
}
