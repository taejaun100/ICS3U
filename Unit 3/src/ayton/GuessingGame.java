/**
 * 
 */
package ayton;

import java.util.Scanner;

/**
 * @author 324117274
 *
 */
public class GuessingGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
	int computer;
	int user;
	
	computer=(int)(Math.random()*20)+1;
	
	System.out.println("Enter a number between 1 and 20:");
	user = scan.nextInt() ;
	System.out.println("Computer's number:"+computer);
	System.out.println("Player's number:"+user);
	
	 if (user==computer){
		 System.out.println("ou won!");
	 } 
	 else {
		 System.out.println("Better luck next time.");
	}
	}
}
