package OOPs;

import java.util.Random;
import java.util.Scanner;


        /*
        Create a class game, which allows a user to play "Guess the number" game once. Game should have the following methods:
        1. Constructor to generate the random number
        2. takeUserInput() to take a user input of number
        3. isCorrectNumber() to defect whether the number entered by the user is true
        Use properties such as noOfGuesses(int), etc to get this task done!
         */



class Game {
    private int number;
    private int userNumber;
    private int noOfGuesses;

    public Game() {
        Random rand = new Random();
        number = rand.nextInt(100) + 1; // random number between 1 to 100
        noOfGuesses = 0;
    }


    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess the number (1 to 100): ");
        userNumber = sc.nextInt();
        setNoOfGuesses(getNoOfGuesses() + 1); // use setter to increment guesses
    }


    public boolean isCorrectNumber() {
        if (userNumber == number) {
            System.out.println("🎯 Congratulations! You guessed it in " + getNoOfGuesses() + " attempts.");
            return true;
        } else if (userNumber < number) {
            System.out.println("Too low... Try again!");
        } else {
            System.out.println("Too high... Try again!");
        }
        return false;
    }


    public int getNoOfGuesses() {
        return noOfGuesses;
    }


    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
}



public class exercise_game {
    public static void main(String[] args) {
        Game g = new Game();
        boolean win = false;


        while (!win) {
            g.takeUserInput();
            win = g.isCorrectNumber();
        }
    }
}



