import java.util.Scanner;
public class PlaySlots {
	public static void main (String[] args){
		SlotMachine slot = new SlotMachine();
		System.out.println("You Start out with $50. Spend it wisely.");
		System.out.println("1. Pull Level 2. Quit!");
		Scanner sc = new Scanner(System.in);
		int x = 0; 
		
	while(x<1) {
		if (sc.nextByte() == 1) {
			slot.pullLever();
			slot.displayRollers();
			slot.displayResults();
		}
		else {
			System.out.println("thanks for playing");
			x++;
		}
	
	}
	}

}
