/**
 * 
 */
package ayton;
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
		Scanner Scan = new Scanner (System.in);
		int a;
		int b;
		int c;
		
		System.out.println("enter number"); 
		a = Scan.nextInt();
		b = Scan.nextInt();
		c = Scan.nextInt();
		
		System.out.println((-1*b)+ Math.sqrt((Math.pow(b,2)-4*a*c))/(2*a));
	}

}
