package p4_11;
import java.util.Scanner;


/**
This class is used to accomplish this info...

A video club wants to reward its best members with a discount based on the member’s number of movie rentals and the number of new members
referred by the member. The discount is in percent and is equal to the sum of the rentals and the referrals, but it cannot exceed 75 percent.
(Hint: Math.min.) Write a program DiscountCalculator to calculate the value of the discount.

Here is a sample run:
Enter the number of movie rentals: 56
Enter the number of members referred to the video club: 3
The discount is equal to:     59.00 percent. 
 */

public class DiscountCalculator {
   public static void main(String[] args) {
	   int _numberOfRentals = -1, _numberOfReferrals = -1;
	   double _discount = -1;
	   System.out.print("Enter the number of movie rentals: ");
	   Scanner scanner = new Scanner(System.in);
	   _numberOfRentals = scanner.nextInt();
	   System.out.print("Enter the number of members referred to the video club: ");
	   _numberOfReferrals = scanner.nextInt();
	   scanner.close();
	   
	   _discount = (_numberOfRentals+_numberOfReferrals);
	   if(_discount>75){_discount=75;}
	   
	   System.out.println("The discount is equal to: "+_discount+"0 percent.");
   }
}
