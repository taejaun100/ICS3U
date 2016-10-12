 /**
 * 
 */
package ayton;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author 324117274
 *Taejaun Ayton 12/10/16
 *order
 */
public class order {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		double b;
		double f;
		double s;
		double total;
		double tax;
		double finaltotal;
		double amount;
		
		System.out.print("Enter the number of burgers: ");b = scan.nextDouble();
		System.out.print("Enter the number of fries: ");f = scan.nextDouble() ;
		System.out.print("Enter the number of sodas: ");s = scan.nextDouble() ; 
		System.out.println("total before tax:"+(df.format((b*1.69)+(f*1.09)+(s*0.99))));
		total = ((b*1.69)+(f*1.09)+(s*0.99));
		System.out.println("Tax:" +(df.format(total*0.065)));
        tax = (total*0.065);
        System.out.println("Final total:" +(df.format(tax+total)));
        finaltotal = (tax+total);
        System.out.print("Enter amount tendered: ");amount = scan.nextDouble() ;
	    System.out.println("change:"+(df.format(amount-finaltotal)));
	}

}
