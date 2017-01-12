/**
 * 
 */
package ayton;
import java.awt.image.BufferedImage;
import java.util.Scanner;
/**
 * @author 324117274
 *
 */
public class Listofnames {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int name =0;
		int num;
		
		
		
		System.out.println("How many names would you like to input");
		num=scan.nextInt();
		String[] list = new String[num];

			num=num +1;
		
			
		System.out.println("Enter Names:");	
	for (int i = 0; i < num; i++){ 
		list[i]= scan.nextLine();
		}
	for (int i = 0; i < 11- 1; i++) 
		System.out.println(list[i]);
	}

	}

	

