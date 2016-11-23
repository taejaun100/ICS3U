/**
 * 
 */
package ayton;

/**
 * @author 324117274
 *Taejaun ayton
 *11/23/16
 *Power table
 *Making a powers table
 */
public class PowersTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.format("%-10s %8s %8s %8s %8s %8s ","X^1","X^2","X^3","X^4","X^5","X^6 \n");
for(int num = 1;num<=6;num++){

	 System.out.format("%-10s %8s %8s %8s %8s %8s ",Math.pow(num, 1),Math.pow(num, 2),Math.pow(num, 3),Math.pow(num, 4),Math.pow(num, 5),Math.pow(num, 6)+"\n");
}

	}

}
