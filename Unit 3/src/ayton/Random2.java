 /**
 * 
 */
package ayton;



/**
 * @author 324117274
 *Taejaun Ayton
 *11/09/16
 *Random 2
 *percent name 
 */
public class Random2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int die1;
		 int die2;
		 int user;
		 int computer;
		 int diec1;
		 int diec2;
		 
		 die1=(int)(Math.random()*6)+1;
		 die2=(int)(Math.random()*6)+1;
		 diec1=(int)(Math.random()*6)+1;
		 diec2=(int)(Math.random()*6)+1;
		 user = die1+die2;
		 computer =diec1+diec2;
		 
		 System.out.println("user " +user +" computer"+computer);
		 if (user>computer){
			 System.out.println("YOU WON");
		 } 
		 else if(user==computer){
			 System.out.println("IT WAS A TIE");
		 }
		 else {
			 System.out.println("YOU LOSE");
		 }
	
	}

}
