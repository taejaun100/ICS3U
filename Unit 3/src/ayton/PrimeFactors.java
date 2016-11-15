/**
 * 
 */
package ayton;

import java.util.Scanner;

/**
 * @author 324117274
 *11/14/16
 *Random Generator
 *find prime factor numbers
 */
public class PrimeFactors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number;
		System.out.print("Enter prime factor");
		number = scan.nextInt() ;
		int count = 2;
		while(count<=number){
			if(number%count==0){
				System.out.println(count);
				number = number/count;}
				else {count = count +1;
			}
		}
	}

}
