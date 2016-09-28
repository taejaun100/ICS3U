/**
 * 
 */
package ayton;
import java.util.Scanner;
/**
 * @author 324117274
 *taejaun ayton
 *09/27/16
 */
public class Expressions1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Scan = new Scanner (System.in);

int num1;
int num2;
int num3; 
int num4;
int num5;

System.out.println("enter number"); 
num1 = Scan.nextInt();
num2 = Scan.nextInt();
num3 = Scan.nextInt();
num4 = Scan.nextInt();
num5 = Scan.nextInt();

System.out.println("your sum is:" +(num1+num2+num3+num4+num5)); 
System.out.println("result after subtracting the second number from the third is:" +(num2-num3));
System.out.println("product of the first and fifth numbers is:" +(num1*num5));
System.out.println("quotient of the fourth number divided by the second is:"+(num4 / num2) );
System.out.println("remainder when dividing the fourth number by the second is:"+(num4 % num2 ));
	} 

}
