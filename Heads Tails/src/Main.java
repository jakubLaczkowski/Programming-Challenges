import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String playerPick;
        String message;
        Scanner scanner = new Scanner(System.in);
        CoinThrower coinThrower = new CoinThrower();

        System.out.println("Heads or tails?");
        playerPick = scanner.nextLine();
        scanner.close();

        message = coinThrower.throwCoin().equalsIgnoreCase(playerPick) ? "You won!" : "You lost :/";
        System.out.println(message);
    }
}
