package p4_8;
import java.util.Scanner;

public class PhoneNumberConversion {
	
	
	/**
	 * This class is made to execute this pseudo-code
//	   The following pseudo-code describes how to turn a string containing a ten-digit phone number (such as "4155551212") into a more readable string with parentheses and dashes, like this: "(415) 555-1212".
//	   Take the substring consisting of the first three characters and surround it with "(" and ") ". 
//	   This is the area code.
//	   Concatenate the area-code, the substring consisting of the next three characters, a hyphen, and the substring consisting of the last four characters. 
//	   This is the formatted number.
//	   Translate this pseudo-code into a Java program that reads a telephone number into a string variable, computes the formatted number, and prints it.
	 * @param args
	 */
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       String rawNumber = scanner.nextLong()+"";
       scanner.close();

       System.out.println("("+rawNumber.substring(0,3)+") "+rawNumber.substring(3,6)+"-"+rawNumber.substring(6));
//       System.out.println("Expected(415) 555-1212");
   }
   
}
