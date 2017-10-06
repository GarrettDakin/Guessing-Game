
public class Calc {
	int RNG = roll();
	int entered;
	
	
	public Calc(int bridge) {
		entered = bridge;	
	}
	
	public int roll() {
		int number = (int) (5 * Math.random() + 1);
		return number; 
		
	}
	
	public void compare() {
		System.out.println("You guessed " + entered);
		System.out.println("The dice rolled " + RNG);
		
		if (RNG == entered) {
			System.out.println("Wow! Nice job, you guessed it!");
			
		}
		
		else if (RNG != entered && entered > 0 && entered < 7) {
			System.out.println("Try again, you didn't get it this time");
		}
		
		else if (entered < 1 || entered > 6) {
			System.out.println("Invalid input");
			
		}
		
	}
	
}
