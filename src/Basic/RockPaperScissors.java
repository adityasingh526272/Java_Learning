package Basic;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Rock Paper Scissors Game");
        System.out.println("Enter your choice (rock , paper, scissors): ");
        String userchoice =sc.next().toLowerCase();
        
        String[] options = {"rock", "paper", "scissors"};
        String computerChoice = options[random.nextInt(3)];

        System.out.println("Computer chose: " +computerChoice);
        
        if (userchoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        }
        else if (
                (userchoice.equals("rock") && computerChoice.equals("scissors")) ||
                        (userchoice.equals("paper") && computerChoice.equals("rock")) ||
                        (userchoice.equals("scissors") && computerChoice.equals("paper"))
                        
        ) {
            System.out.println("You win!");
        } else if (
                (userchoice.equals("rock") || userchoice.equals("paper") || userchoice.equals("scissors"))
        ) {
            System.out.println("computer wins!");

        }
        else{
            System.out.println("Invalid input!");
        }
    }
}
