package task1;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Random randomIntegerGenerator = new Random();
        Scanner input = new Scanner(System.in);

        int generatedInteger = randomIntegerGenerator.nextInt(100);
        int guessedInteger;
        int numOfCorrectGuesses = 0;
        int numOfGuessesLeft = 6;

        boolean isPlaying = true;
        boolean isCorrectGuess = false;

        printGameRules();

        do {

            System.out.println("Enter a number between 0 and 99");

            try {
                guessedInteger = input.nextInt();
                input.nextLine();

            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("Number must be an integer");
                continue;
            }

            if (guessedInteger == generatedInteger){
                isCorrectGuess = true;
                ++numOfCorrectGuesses;

            } else if (guessedInteger > generatedInteger) {
                System.out.println("Too high!");
                printNumberOfGuessesLeft(numOfGuessesLeft);
            }
            else {
                System.out.println("Too low!");
                printNumberOfGuessesLeft(numOfGuessesLeft);
            }

            --numOfGuessesLeft;

            if(numOfGuessesLeft == 0 || isCorrectGuess){

                String endOfGameMessage = getEndOfGameMessage(isCorrectGuess);
                System.out.println(endOfGameMessage);

                System.out.println("Play again? y : n ");
                String playAgain = input.nextLine();

                if("y".equals(playAgain)){
                    numOfGuessesLeft = 6;
                    isCorrectGuess = false;
                    generatedInteger = randomIntegerGenerator.nextInt(100);
                }
                else {
                    isPlaying = false;
                    printNumberOfCorrectGuesses(numOfCorrectGuesses);
                }
            }

        }while (isPlaying);


    }

    public  static  void printGameRules() {
        String gameRules = """
                =============== NUMBER GAME ===============
                ---------------    Rules    ---------------
                The system will generate a number between 0 and 99 inclusive
                Your job is to guess the generated number correctly.
                You have 6 chances to guess the number.
                """;

        System.out.println(gameRules);
    }

    public  static void printNumberOfGuessesLeft(int numOfGuessesLeft) {
        System.out.printf("You have %d chances left %n",numOfGuessesLeft);
    }

    public static void printNumberOfCorrectGuesses(int numOfCorrectGuesses) {
        System.out.printf("Score : %d %n",numOfCorrectGuesses);
    }

    public static String getEndOfGameMessage(boolean isCorrectGuess){
        return isCorrectGuess ? "Congratulations!" : "Game Over!!";
    }



}
