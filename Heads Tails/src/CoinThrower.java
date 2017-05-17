import java.util.Random;

public class CoinThrower {
    private Random random = new Random();

    public String throwCoin(){
        int headsOrTails = random.nextInt(2);
        return headsOrTails == 0 ? "Heads" : "Tails";
    }
}
