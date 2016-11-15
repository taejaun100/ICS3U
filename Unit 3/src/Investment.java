import java.util.Scanner;

/**
 * 
 */

/**
 * @author 324117274
 *
 */
public class Investment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub



		int number = 2500;
		int tnum = 5000;
		int year=1;
		double curent = number;
		while(curent < tnum) {
			year=year+1;

			curent=curent*1.075;

		}
		System.out.println("it will take "+ (int)year +" to make $"+tnum);
	}
}



