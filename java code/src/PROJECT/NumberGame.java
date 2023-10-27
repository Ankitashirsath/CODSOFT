package PROJECT;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Scanner Scanner =new Scanner(System.in);
		Random random =new Random();
		int lowerBound = 1;
		int upperBound = 100;
		int secretNumber = random.nextInt(upperBound - lowerBound + 1)+lowerBound;
		int attempts = 0;
		boolean hasGuessCorrectly= false;
		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println("I'm thinking of a number between" + lowerBound +"and"+ upperBound + "Try to guess it!");
		while(!hasGuessCorrectly)
		{
			System.out.println("Enter your guess: ");
			int userGuess = Scanner.nextInt();
			attempts ++;
			if(userGuess <lowerBound || userGuess >upperBound)
			{
				System.out.println("Your guess is not valid. Try again.");
			}
			else if (userGuess< secretNumber)
			{
				System.out.println("high number");
			}
			else if (userGuess > secretNumber)
			{
				System.out.println("low number");
			}
			else
			{
			System.out.println("congratulations! You guessed the correct number:"+ secretNumber);
			System.out.println("Number attempts: "+ attempts);
			hasGuessCorrectly = true;
			}
		}
		
          Scanner.close();
	}

}
