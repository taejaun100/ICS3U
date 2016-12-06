import java.util.Scanner;

/**
 * 
 */

/**
 * @author 324117274
 *30/11/16
 *Taejaun ayton
 *Countvowels
 *count the number of vowels 
 */
public class CountVowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vowels = 0;
		int v;
		String j;
		String text;
		int num;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter text: ");
		text=scan.nextLine();
		num = text.length();
		System.out.println(num);
		for (v=0;v< num;v++){

			j=text;


			if (j.charAt(v)=='a')
				vowels++;
			else if(j.charAt(v)=='e')
				vowels++;
		    else if(j.charAt(v)=='i')
		    	vowels++;
			else if(j.charAt(v)=='o')
				vowels++;
			else if(j.charAt(v)=='u')
				vowels++;


	}
        System.out.println("The number of vowels in " +text+" is "+vowels);
	}
}
