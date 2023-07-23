import java.util.Scanner;
import java.util.Random;

public class gptHangman {
    public static void main(String[] args) {
        String[] wordBank = { "apple", "banana", "orange", "grape", "kiwi" };
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String chosenWord = wordBank[random.nextInt(wordBank.length)];
        int maxAttempts = 6;
        int attemptsLeft = maxAttempts;
        StringBuilder guessedWord = new StringBuilder("_".repeat(chosenWord.length()));
        StringBuilder wrongGuesses = new StringBuilder();

        System.out.println("Welcome to Hangman! Try to guess the word.");
        System.out.println("You have " + maxAttempts + " attempts to save the hangman!");

        while (attemptsLeft > 0) {
            System.out.println("\nWord: " + guessedWord);
            System.out.println("Wrong guesses: " + wrongGuesses);
            System.out.print("Guess a letter: ");
            char guess = scanner.next().charAt(0);

            if (chosenWord.contains(String.valueOf(guess))) {
                for (int i = 0; i < chosenWord.length(); i++) {
                    if (chosenWord.charAt(i) == guess) {
                        guessedWord.setCharAt(i, guess);
                    }
                }
            } else {
                wrongGuesses.append(guess).append(" ");
                attemptsLeft--;
            }

            if (guessedWord.toString().equals(chosenWord)) {
                System.out.println("\nCongratulations! You saved the hangman! The word was: " + chosenWord);
                break;
            }
        }

        if (attemptsLeft == 0) {
            System.out.println("\nOh no! The hangman is hanged! The word was: " + chosenWord);
        }

        scanner.close();
    }
}
