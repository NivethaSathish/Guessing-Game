//Nivetha Sathish - HiLo Assignment
package hilowassignment;

import java.util.Scanner;

/**
 *
 * @author 073785628
 */
public class NivethaHiLoAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char playDecision = 'y';//let play decision be yes to start game
        while (playDecision == 'y') {//while play decision is yes execute commands below
            double numberGuesses = 0;//set number of guesses to 0
            double randomNumber = (int) (Math.random() * 5) + 1;//generate random number
            //opening text art below
            System.out.println("                                                                                                                      ");
            System.out.println("HHHHHH|   |HHHHHH         LLL                 www                 www            ");
            System.out.println("HHHHHH|   |HHHHHH         LLL                  www               www           ");
            System.out.println("HHHHHH|   |HHHHHH   ***   LLL                   www             www           ");
            System.out.println("HHHHHHHHHHHHHHHHH   iii   LLL        oooooooo    www    www    www         ");
            System.out.println("HHHHHHHHHHHHHHHHH   iii   LLL        oo    oo     www  ww ww  www                     ");
            System.out.println("HHHHHH|   |HHHHHH   iii   LLL        oo    oo      ww ww   ww ww                 ");
            System.out.println("HHHHHH|   |HHHHHH   iii   LLLLLLLL   oooooooo       ww       ww                  ");
            System.out.println("                                                                  ");
            System.out.println("Welcome to HiLo! To play, guess the random number from 1 to 50 that we have picked. We will tell you if your guess is too high or too low until you guess the right number.");
            System.out.print("Enter Your Guess: ");
            double userGuess = keyboard.nextDouble();//let user enter first guess
            while (userGuess != randomNumber) {//while the user's guess does not equal the random number, execute commands below
                if (userGuess < randomNumber) {//if the guess is less than the random number
                    System.out.print("Your Guess is Less Than the Random Number! Try Again: ");
                    numberGuesses = numberGuesses + 1;//add one to the guess count
                    userGuess = keyboard.nextDouble();//let the user try guessing the number again

                } else if (userGuess > randomNumber) {//if user's guess is greater than the random number
                    System.out.print("Your Number is Greater Than the Random Number! Try Again: ");
                    numberGuesses = numberGuesses + 1;//add one to the guess count
                    userGuess = keyboard.nextDouble();//let the user try guessing the number again
                }
            }
            if (userGuess == randomNumber) {//if the user guesses correctly
                numberGuesses = numberGuesses + 1;//add one to the guess count
                System.out.print("Congratulations, You Guessed Correctly!");
                if (numberGuesses == 1) {//if the user only took one try to guess correctly
                    System.out.println(" Wow! You Only Took " + numberGuesses + " Try to Guess the Number. Thanks for Playing! Would You Like to Play HiLo Again?");
                } else if (1 < numberGuesses) {//if the user took more than one guess to guess correctly
                    System.out.println(" You Took " + numberGuesses + " Tries to Guess the Number. Thanks for Playing! Would You Like to Play HiLo Again?");
                }
                System.out.print("Enter y to Play Again and n to Stop Playing: ");//let user type 'y' to play again or 'n' to stop playing
                playDecision = keyboard.next().charAt(0);//let the play decision be the user's entry, if the user decides to play again, the game will restart, if not the commands below will execute
                if (playDecision == 'n') {//if the user decides not to play

                    System.out.println("                                                                                                                      ");
                    System.out.print("Thanks for Playing HiLo!");
                    //closing text art below
                    System.out.println("                                                                                                                      ");
                    System.out.println("######  #######  #######     ##       ##  ########  ##    ##     ######  ########  ########  ###     ##     ###        ");
                    System.out.println("######  #######  #######     ##       ##  ########  ##    ##     ######  ########  ########  ###     ##     ###        ");
                    System.out.println("######  #######  #######      ##     ##   ##    ##  ##    ##     ######  ##    ##  ##    ##  ###     ##     ###           ");
                    System.out.println("##      ##       ##             ##  ##    ##    ##  ##    ##     ##      ##    ##  ##    ##  ####    ##     ###           ");
                    System.out.println("######  #######  #######          ##      ##    ##  ##    ##     ######  ##    ##  ##    ##  ## ##   ##     ###         ");
                    System.out.println("######  #######  #######          ##      ##    ##  ##    ##     ######  ##    ##  ##    ##  ##  ##  ##     ###             ");
                    System.out.println("    ##  ##       ##               ##      ##    ##  ##    ##         ##  ##    ##  ##    ##  ##   ## ##                 ");
                    System.out.println("######  #######  #######          ##      ##    ##  ##    ##     ######  ##    ##  ##    ##  ##    ####     ###       ");
                    System.out.println("######  #######  #######          ##      ########  ########     ######  ########  ########  ##     ###     ###             ");
                    System.out.println("                                                                                                                      ");

                }
            }
        }
    }
}
