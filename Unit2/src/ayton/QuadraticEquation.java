/**
 * 
 */
package ayton;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author 324117274
 * Taejaun ayton
 *Quadratic Equation
 *09/27/16
 */
public class QuadraticEquation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("0.00");

			
			int a;
			int b;
			int c;
			
			System.out.println("Please enter 3 numbers:");
			a = scan.nextInt() ;
			b = scan.nextInt() ;
			c = scan.nextInt() ;
			
			System.out.println(df.format((-b + Math.sqrt((Math.pow(b, 2)-4*a*c)))/(2*a)));
			System.out.println(df.format((-b - Math.sqrt((Math.pow(b, 2)-4*a*c)))/(2*a)));
	}

}
