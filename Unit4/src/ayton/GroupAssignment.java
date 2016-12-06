/**
 * 
 */
package ayton;

import java.util.Scanner;

/**
 * @author 324117274
 * 30/11/16
 *Taejaun ayton
 *Group Assignment
 *Matching the letters of names with there groups
 */
public class GroupAssignment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String first;
		String last;

		System.out.println("Enter your first name: ");
		first= scan.nextLine() ;
		System.out.println("Enter your last name: ");
		last = scan.nextLine() ;




		if (last.startsWith("a")||last.startsWith("b")||last.startsWith("c")||last.startsWith("d")||last.startsWith("e")||last.startsWith("f")||last.startsWith("g")||last.startsWith("h")||last.startsWith("i")){
			System.out.print(first+last+"is assigned to group 1");}
	    else if (last.startsWith("j")||last.startsWith("k")||last.startsWith("l")||last.startsWith("m")||last.startsWith("n")||last.startsWith("o")||last.startsWith("p")||last.startsWith("q")||last.startsWith("r")||last.startsWith("s")){
          System.out.print(first+last+"is assigned to group 2");}
else 
	System.out.print(first+last+"is assigned to group 3");
				

	}

}
