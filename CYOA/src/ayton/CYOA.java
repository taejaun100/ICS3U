/**
 * 
 */
package ayton;

import hsa_new.Console;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
/**
 * @author 324117274
 *
 */
public class CYOA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console c = new Console();
		BufferedImage[] equipment = new BufferedImage[10];

		try {
		equipment[0] = ImageIO.read(new File("src/axe.jpg"));
		equipment[1] = ImageIO.read(new File("src/flare gun.jpg"));
		equipment[2] = ImageIO.read(new File("src/Note7.jpg"));
		equipment[3] = ImageIO.read(new File("src/PlaneCrash.jpg"));
		equipment[4] = ImageIO.read(new File("src/wolf.jpg"));
		equipment[5] = ImageIO.read(new File("src/lock door.jpg"));
		
		
		String q;
		c.println("Would you like to play again");
		q = c.readLine();
		do {
			c.clear();
			c.println("You woke up after your plane crashed on a small island");
			c.println("Would you like to explore the Island or stay with the plane?(explore/stay)");
			c.drawImage (equipment[3], 0, 75, 700, 500, null);
			String q1 = c.readLine();
			c.clear();
			if (q1.equals("explore")) {
				c.println("Would you like to go north or south?(north/south)");
				String q2 = c.readLine();
				c.clear();
				if (q2.equals("south")) {
					c.println("A pack of wolf starts to chase you");
					c.println("Do you run away or climb a tree?(tree/run)");
					c.drawImage (equipment[4], 0, 75, 700, 500, null);
					String q3 = c.readLine();
					c.clear();
					if (q3.equals("run")) {
						c.println("You got tired of running, as you look back, the pack is getting closer");
						c.println("and catches you");
						c.println("You died");
						c.println("Would you like to play again?");
						q = c.readLine();
						c.clear();
					} else {
						double num = Math.random();
						c.println("You climb a tree and seems unsafe and it may fall over");
						if (num <= 0.7) {
							c.println("you die after the tree falls on you and the wolf eat you");
							c.clear();
							c.println("would you like to play again?");
							q = c.readLine();
							c.clear();
						} else {
							c.println("You have been in the tree for a while,");
							c.println("Then as you lose hope, a helicopter spots you and flys in to save you");
							c.clear();
							c.println("Would you like to play again?");
							q = c.readLine();
							c.clear();
						}
					}
				} else {
					c.println("You find a phone, axe and a flare witch one do you pick?(axe/phone/flair)");
					c.drawImage (equipment[0], 0, 50, 150, 150, null);
					c.drawImage (equipment[1], 150, 50, 150, 150, null);
					c.drawImage (equipment[2], 300, 50, 150, 150, null);
					String q5 = c.readLine();
					c.clear();
					if (q5.equals("axe")) {
						c.println("Would you like to build a fire or a raft?(fire/raft)");
						String q6 = c.readLine();
						c.clear();
						if (q6.equals("raft")) {
							c.println(
									"You build a raft, after the raft is built you use it to flot to a near by boat ");
							c.println("You won");
							c.println("Would you like to play again?");
							q = c.readLine();
							c.clear();

						} else {
							c.println("When you go to collect fire wood, a pack of wolf jumped you from behind");
							c.println("and killed you");
							c.println("You died");
							c.println("Would you like to play again?");
							q = c.readLine();
							c.clear();
						}
					} else if (q5.equals("phone")) {
						c.println("When you dialed 911 the phone exploaded in your face");
						c.println("You Died");
						c.println("Would you like to play again?");
						q = c.readLine();
						c.clear();
					} else {
						c.println("As you pick up the flare");
						c.println("You see a helicopter and use it to call for it");
						c.println("You won");
						c.println("Would you like to play again?");
						q = c.readLine();
					}
				}

			}

			else {
				c.println("Do you explore the surrounding area of the plane or stay inside the plane?");
				c.println("(inside/outside)");
				String q4 = c.readLine();
				c.clear();
				double num2 = Math.random();
				if (q4.equals("outside")) {
					c.println("You dicided to flip a coin, if heads you go to the front of the plane");
					c.println("if tails you head to the back of the plane");
					c.clear();
					if (num2 <= 0.5) {
						c.println("You got Heads");
						c.println("You head to the front of the plane.");
						c.println("When you reach the head of the plane. There is a door that is locked.");
						c.drawImage (equipment[5], 150, 150, 300, 300, null);
						int computer = (int) (Math.random() * 10) + 1;
						int counter=0;
						while (counter<=2){
							c.print("Enter a number between 1 and 10 you have 3 trys:");
							int user = c.readInt();
							if (user == computer) {
								c.println("You get in and see a black box. You use it to call for help");
								c.println("Few hours later you hear, loud noise, as you look up you");
								c.println("see a helicopter. Comming to save you");
								c.println("You SURVIVE!!");
								c.println("Would you like to play again?");
								q = c.readLine();
								break;
							} else {
								counter ++;

							}
						}
						if(counter == 3){
							c.println("You set off an alarm, then predators were attracted to the noise");
							c.println("Surrounded with no way out");
							c.println("You Died from predator attack");
							c.println("Would you like to play again");
							q = c.readLine();
						}

					}else{
						c.println("You got Tails");
						c.println("You headed to the end of the plane and found a flashlight laying in the ground,");
						c.println("You tryied to pick it up, but you fell in a hole and stepped on a trap, you find");
						c.println("a puzzle. Which may stop the trap from killing you");
					int computer2 = (int) (Math.random() * 10) + 1;
					int counter2= 0;
					while (counter2<=1) {
						c.print("Enter a number between 1 and 10 you have 2 try:");
						int user2 = c.readInt();
						if (user2 == computer2) {
							c.println("The trap stops and a door opens, as you walk towards it");
							c.println("it shot flaming arrow and killed you");
							c.println("Would you like to play again?");
							q = c.readLine();
							break;
						} else {
							counter2 ++;
						}

					}
					if (counter2 == 2){
						c.println("POISONOUS GAS WAS ACTIVITED");
						c.println("You Died!");
						c.println("Would you like to play again");
						q = c.readLine();

					}
					
					}

				} else {
					c.println("You died from starvation and predator attack!!");
					c.println("Would you like to play again");
					q = c.readLine();
				}

			}

		} while (q.equals("yes"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
