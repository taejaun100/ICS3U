/**
 * 
 */
package ayton;

import java.util.Scanner;

/**
 * @author 324117274
 * *Taejaun ayton
 *11/23/16
 *Power table
 *Making a powers table
 */
public class GuessingGame2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int computer;
		int user;
		int counter=1;
		String q;



		do{
			computer=(int)(Math.random()*20)+1;
			System.out.println("Enter a number between 1 and 20:");
			user = scan.nextInt() ;
			 scan.nextLine() ;

			if (user==computer){
				System.out.println("You won!");
				counter= counter+1;
			} 
			else {
				System.out.println("Try again.");

			}

		}while(counter<=1);


	}
}

	



