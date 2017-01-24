/**
 * 
 */
package ayton;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import hsa_new.Console;

/**
 * @author 324117274
 *
 */
public class Finalproject {

	static Console c = new Console();
	static String[]display=new String[20];
	static String[]q=new String[20];
	static int mark=0;

	
		public static String checkAnswer(String q, String answer){
			String ca = null;

			if (answer.equals(q)){
				mark=mark+1;
				ca="hi";

			}
			else{
				ca="1";

			}

		
			return ca;
		}


		public static void showResults(){
			mark=((mark/10)*100);
			c.println(mark+"%");
		}

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			String ca;
			String answer;
			
			q[0]="a";
			q[1]="b";
			q[2]="c";
			q[3]="d";
			q[4]="c";
			q[5]="b";
			q[6]="a";
			q[7]="c";
			q[8]="b";
			q[9]="d";


			display[0]=("Q1\nIn a decomposition reaction?\nA)energy in the form of heat or light is often produced\nB)one of the reactants is often water\nC)the reactants are usually a metal and a non-metal\nD)the reactants are generally two ionic compounds in aqueous solution");
			display[1]=("Q2\nOf the balanced chemical equations below, which one most correctly represents a combustion reaction?\nA)2 Mg + O2 -> 2 MgO\nB)2 CH4 + 4 O2 -> 2 CO2 + 4 H2O\nC)CaO + H2O -> Ca(OH)2\nD)2 N2 + 3 H2 -> 2 NH3\n");
			display[2]=("Q3\nThe chemical equation, Cr  +  Fe(NO3)2 ->  Fe  +  Cr(NO3)3, is an example of which type of reaction?\nA)decomposition\nB)combustion\nC)single-displacement\nD)double-DIsplacement\n");
			display[3]=("Q4\n\nA)combustion\nB)single-displacement\nC)single-displacement\nD)double-DIsplacement");
			display[4]=("Q5\nIn the following chemical reaction, what product is represented by X?AlCl3  +  NaOH -> X + NaCl \nA)AlOH\nB)Al3OH\nC)Al(OH)3\nD)Al2OH\n");
			display[5]=("Q6\nWhen propane is reacted in the presence of oxygen gas, the products of this combustion reaction are:\nA)CO2 + H2\nB)CO2 + H2O\nC)C + H2\nD)CH2 + H2O\n");
			display[6]=("Q7\nCombination reactions always:\nA)form only one product\nB)require oxygen gas\nC)involve an element and an ionic compound\nD)use only one reactant");
			display[7]=("Q8\nWhich chemical equation correctly represents the decomposition reaction that takes place when ammonia breaks down to form hydrogen gas and nitrogen gas?\nA)NH3 + H2 ->N2\nB)N2 + H2 -> NH3\nC)NH3 -> N2 + H2\nD)NH3 -> N + H");
			display[8]=("Q9\nOf the reactions below, which one is a double-replacement reaction?\nA)2 N2 + 3 H2 -> 2 NH3\nB)Cd(NO3)2 + Na2S -> CdS + 2 NaNO3\nC)2 Mg + O2 ->2 MgO\nD)NH4Cl ->NH3 + HCl");
			display[9]=("Q10\nWhich of the following are decomposition reactions?1.	CH4 (g) + O2 (g)  ->  CO2 (g) + H2O (l)\n2.	CaO (s) + CO2 (g)  ->  CaCO3 (s)\n3.	Mg (s) + O2 (g)  ->  MgO (s)\n4.	PbCO3 (s)  -> PbO (s) + CO2 (g)\n\nA)2 and 3\nB)1\nC)4 and 1\nD)4 ");
			c.println("Chemistry Quiz" );
			c.println("Would you like to start(Yes/No)");
			String q1 = c.readLine();
			for (int i = 0; i < 10; i++){
				if (q1.equals("yes")){
			c.clear();
					c.print(display[i]);
					c.println("What is the answer(a,b,c,d)");	

					answer= c.readLine();
					ca = checkAnswer(q[i], answer);
		
					
	
				}

				
			}
			c.clear();
			showResults();

  

		}

	}
