import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int maxAttempts = 7;
        int score = 0;
        int round = 1;
        char playAgain;

        do {
            int number = rand.nextInt(100) + 1; // 1 to 100
            int attempts = 0;
            int guess = 0;

            System.out.println("\n🎮 ROUND " + round);
            System.out.println("Guess the number between 1 and 100");
            System.out.println("You have " + maxAttempts + " attempts");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println("🎉 Correct! You guessed in " + attempts + " attempts");
                    score += (maxAttempts - attempts + 1);
                    break;
                } else if (guess > number) {
                    System.out.println("📉 Too High");
                } else {
                    System.out.println("📈 Too Low");
                }
            }

            if (guess != number) {
                System.out.println("❌ Out of attempts! Correct number was: " + number);
            }

            System.out.println("Current Score: " + score);

            System.out.print("Do you want to play again? (y/n): ");
            playAgain = sc.next().charAt(0);

            round++;

        } while (playAgain == 'y' || playAgain == 'Y');

        System.out.println("\n🏁 Game Over");
        System.out.println("Final Score: " + score);
        sc.close();
    }
}