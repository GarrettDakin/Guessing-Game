import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Guess what number will be generated! (1-6)");
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();
		
		Calc calc = new Calc(guess);
		calc.compare();
	
		input.close();
	}
	
}
