package ayton;

public class gdfgdfgdfg {

}						int computer = (int) (Math.random() * 10) + 1;
int counter=0;
while (counter<=1){
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

while (counter2<=1) {
	c.print("Enter a number between 1 and 10 you have 2 try:");
	int user2 = c.readInt();
	if (user2 == computer2) {
		c.println("The trap stops and a door opens, as you walk towards it");
		c.println("it shot flaming arrow and killed you");
		break;
	} else {
		counter2 ++;
	}

	}
if (counter2 == 1){
	c.println("POISONOUS GAS WAS ACTIVITED");
	c.println("You Died!");
	c.println("Would you like to play again");
	q = c.readLine();
