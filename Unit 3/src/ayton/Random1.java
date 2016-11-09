/**
 * 
 */
package ayton;
import java.util.Scanner;

/**
 * @author 324117274
 * 
 *ICS3U
 *Taejaun Ayton
 *11/09/16
 *Random 1
 *percent name 
 */
public class Random1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

String name;
Scanner scan = new Scanner(System.in);

System.out.println("Enter your name:");
 name = scan.nextLine();
 Double num;
 num =(double)(Math.random()*2);
 System.out.println( + num );
 if(num<=0.7){
	 System.out.println("This name is your farorite name is: " +name);}
	 else{
	 System.out.println("You hate this name: "+name);
	 }
	}

}
