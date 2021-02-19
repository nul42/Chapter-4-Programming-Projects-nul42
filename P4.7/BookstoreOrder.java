package p4_7;

import java.util.Scanner;
import java.lang.Math.*;
/**
This class should...
Read the total book price and the number of books.
Compute the tax (7.5 percent of the total book price).
Compute the shipping charge ($2 per book).
The price of the order is the sum of the total book price, the tax, and the shipping charge.
Print the price of the order.
*/

public class BookstoreOrder {
	
	/**
	 * This computes and returns the amount of money you need to pay extra for a tax.
	 * 
	 * @param ammount_ the cost of what you want taxed in dollars.
	 * @param taxRate_ the percentage of the tax.
	 * @return The cost in dollars of the tax you need to pay.
	 */
	private static double computeTax(double ammount_, double taxRate_) {
		return ammount_*(taxRate_/100.0);
	}
	
	
   public static void main(String[] args) {
// int input = new Scanner(System.in).nextInt();//Resource Leak
   	
	 System.out.print("Please enter the total book price: ");
     Scanner scanner = new Scanner(System.in);
     double totalBookPrice = scanner.nextDouble();
	 System.out.print("Please enter the total number of books purchased: ");
     double numberOfBooks = scanner.nextDouble();
     scanner.close();
     
     double _totalPrice = computeTax(2.00*numberOfBooks + totalBookPrice, 7.5) + 2.00*numberOfBooks + totalBookPrice;
//     _totalPrice = ((int) _totalPrice*1000)/100;
     _totalPrice = Math.round(_totalPrice*100000)/100000.0;
     
     System.out.println("The total cost due for your order is $"+_totalPrice);
//     System.out.println((totalBookPrice+2*numberOfBooks)*1.075);
   }
   
}
