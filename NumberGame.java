package G1;
import java.util.Random;
import java.util.Scanner;
public class NumberGame{
    public static void main(String[] args)
    {
        int answer, guess;// stores actual and guess number
        final int MAX = 100;  // maximum value is 100
        Scanner in = new Scanner(System.in);// takes input using scanner
        Random rand = new Random();// Random instance
        boolean correct = false;// correct answer
        answer = rand.nextInt(MAX) + 1;
        // loop until the guess is correct
        while (!correct) {
            System.out.println("Guess a number between 1 and 100: ");
            guess = in.nextInt(); // guess value
            if (guess > answer) { // if guess is greater than actual
                System.out.println("Too high, try again");
            }
            else if (guess < answer) { // if guess is less than actual
                System.out.println("Too low, try again");
            }
            else {// guess is equal to actual value
                System.out.println("Yes, you guessed the number.");
                correct = true;
            }
        }
    }
}
