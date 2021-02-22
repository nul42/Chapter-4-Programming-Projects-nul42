/*Giving change. Implement a program that directs a cashier how to give change. The program has two inputs: the amount due and
the amount received from the customer. Display the dollars, quarters, dimes, nickels, and pennies that the customer should receive in
return. (Hint: You may want to multiply the amount by 100 to make the math easier)
*/
package p4_10;
import java.util.Scanner;


/*
This class is used to get a price of money to return to the customer and prints out how many dollars, quarters, dimes, nickels, and pennies that the customer should have returned.
*/
public class GiveChange {
	
   public static void main(String[] args) {
	   long dollars = 0, returnTotal = 0;
	   int quarters = 0, dimes = 0, nickels = 0, pennies = 0;
	   System.out.print("Please enter an ammount in dollars: ");
	   Scanner scanner = new Scanner(System.in);
       returnTotal = (long) (scanner.nextDouble()*100);//I don't think that this will be working with billions of dollars but might as well.
       scanner.close();
       
//       Casting in case of too many points, do we want to round less then pennies, or are we provided with how much it should return.
       dollars = returnTotal/100;
       returnTotal -= dollars*100;
       quarters = (int) returnTotal / 25;
       returnTotal -= quarters*25;
       dimes = (int) returnTotal / 10;
	   returnTotal -= dimes*10;
	   nickels = (int) returnTotal / 5;
       returnTotal -= nickels*5;
       pennies = (int) returnTotal;
       System.out.println("The customer should recieve "+dollars+" dollars, "+quarters+" quarters, "+dimes+" dimes, "+nickels+" nickels, and "+pennies+" pennies.");
   }
}
