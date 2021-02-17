package p4_3;

import java.util.Scanner;

/**
 * Read a number from the user. Discard all but the last three digits.
 * Reverse the digits, subtract the original from the reversed (discarding any
 * minus sign), reverse the digits of the difference, and add the difference and
 * the reversed difference. For example:
 * 
 * Input: 371
 * Reversed: 173
 * Difference: 198
 * Reversed: 891
 * Sum: 1089
 */
public class TenEightyNinePuzzle {

    /**
     * Reverse the last 3 digits of number
     *
     * @param n the number
     * @return the reverse of the last 3 digits of n
     */
    static int reverse(int n) {
//    	n = n % 1000;
    	
    	char first = (n+"").charAt(0);
    	char second = (n+"").charAt(1);
    	char third = (n+"").charAt(2);
//		System.out.println(third+second+first);//I believe it was grabbing the character numerical values and adding them.
		return Integer.valueOf(third+""+second+""+first);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int input = new Scanner(System.in).nextInt();//Resource Leak
    	
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();
    	
//    	input = 3282371;
    	input = Math.abs(input % 1000);
    	int reversed1 = reverse(input);
    	int difference = Math.abs(input - reversed1);
    	int reversed2 = reverse(difference);
    	int sum = difference + reversed2;
    	
//    	System.out.println("Input was: "+input);
    	System.out.println(reversed1);
    	System.out.println("Expected: 173");
    	System.out.println(difference);
    	System.out.println("Expected: 198");
    	System.out.println(reversed2);
    	System.out.println("Expected: 891");
    	System.out.println(sum);
    	System.out.println("Expected: 1089");
    }
}

