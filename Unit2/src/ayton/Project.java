/**
 * 
 */
package ayton;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author 324117274
 *Taejaun Ayton 12/10/16
 *project
 *
 */
public class Project {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		double d;
		double code;
		double bug;
		double test;
		double tasktime; 

		
		System.out.print("Designing:");d = scan.nextDouble();
		System.out.print("Coding:");code = scan.nextDouble();
		System.out.print("Debugging:");bug = scan.nextDouble();
		System.out.print("Testing:");test = scan.nextDouble();
		System.out.println("Task\t % Time");
		tasktime = (d+code+bug+test);
		System.out.println("Designing:\t" +  (df.format((d / tasktime)*100))+("%"));
		System.out.println("Coding:\t"+  (df.format((code / tasktime)*100))+("%"));
		System.out.println("Debugging:\t"+  (df.format((bug / tasktime)*100))+("%"));
		System.out.println("Testing:\t"+  (df.format((test / tasktime)*100))+("%"));
		
		
	}

}
