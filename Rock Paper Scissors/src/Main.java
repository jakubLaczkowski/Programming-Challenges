import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {

        String playerChoice;
        String aiChoice;
        int randomNumber;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Make your choice (rock/paper/scissors):");
        playerChoice = scanner.nextLine().toLowerCase();

        randomNumber = random.nextInt(3);
        aiChoice = randomNumber == 0 ? "rock" : (randomNumber == 1 ?  "paper" : "scissors");
        System.out.println(aiChoice);

      /*  if(playerChoice.equals("rock"))
            System.out.println(aiChoice == "rock" ? "Draw!" : (aiChoice.equals("scissors") ? "You won!" : "You lost!" ));
        else if(playerChoice.equals("scissors"))
            System.out.println(aiChoice.equals("rock") ? "You lost!" : (aiChoice.equals("scissors") ? "Draw" : "You won!" ));
        else
            System.out.println(aiChoice.equals("rock") ? "You won!" : (aiChoice.equals("scissors") ? "You lost!" : "Draw!" ));
        */
        if(playerChoice.equals(aiChoice)) {
            System.out.println("Draw!");
        }
        else {
            String winner = (playerChoice + aiChoice).equals("rockscissors") || (playerChoice + aiChoice).equals("scissorspaper") ||
                    (playerChoice + aiChoice).equals("paperrock") ? "won!" : "lost!";
            System.out.println("You " + winner);
        }
        scanner.close();
    }
}
