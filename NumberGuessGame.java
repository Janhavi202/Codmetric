import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class NumberGuessGame {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Random random = new Random();
        int targetNum = random.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);
        int attempts = 0;
        int guesses = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");

        while (true) {
            System.out.print("Enter your guess");

            try {
                guesses = Integer.parseInt(sc.nextLine());

                if (guesses < 1 || guesses > 100){
                    System.out.println("Please enter a number between 1 to 100");
                    continue;
                }

                if (guesses < targetNum) {
                    System.out.println("Too Low! Try again");
                } else if (guesses > targetNum) {
                    System.out.println("Too High! try again");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    break;
                }
            } catch (NumberFormatException e){
                System.out.println("Invalid input! Please enter a numeric value.");
            }
        }

        sc.close();
    }
}