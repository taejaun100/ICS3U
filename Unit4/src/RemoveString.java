import java.util.Scanner;

/**
 * 
 */

/**
 * @author 324117274
 * 30/11/16
 *Taejaun ayton
 *Remove String
 *removing the string from words
 */
public class RemoveString {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String sentence;
		String x;
		String Final;
		System.out.println("Enter a sentence: ");
		sentence = scan.nextLine() ;
		System.out.println("Enter a string: ");
		x = scan.nextLine() ;
		sentence = sentence.replace(x ,"" );
		System.out.println(sentence.trim());
	}

}
