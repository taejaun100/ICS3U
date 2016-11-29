/**
 * 
 */
package ayton;

import java.util.Scanner;

/**
 * @author 324117274
 * Taejaun ayton
 *11/23/16
 *ElapsedTimeCalculator
 *calculating the elapsed time
 */
public class ElapsedTimeCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int time;
		String am;
         int elapsed;
		 int add=12;
		
		System.out.print ("Enter the starting hour: ");time = scan.nextInt ();scan.nextLine();
	    System.out.print ("Enter am or pm: ");	am = scan.nextLine(); 
	    System.out.print ("Enter the Elapsed Time: ");elapsed = scan.nextInt();
		 if(am.equals("pm")){
		time=time+add;
	
		 }
		 else {}
		
		 
		 if (time<=12){
			time=(time+elapsed);
			if (time>12){
			time=time-12;	
		 System.out.println(time+"pm");
		 }
			else
				time=time-12;
			 System.out.println(time+"am");
		 }
		 else
			 time=(time+elapsed);
			if (time>24){
			time=time-24;	
		 System.out.println(time+"pm");
		 }
			else
				time=time-24;
			 System.out.println(time+"am");
	
	}

}
