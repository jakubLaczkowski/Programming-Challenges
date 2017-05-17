import java.util.Random;
import java.util.ArrayList;

public class NameGenerator {

    public String generateName(ArrayList<String> firstNames, ArrayList<String> middleNames, ArrayList<String> lastNames){
        Random random = new Random();
        return firstNames.get(random.nextInt(firstNames.size())) + " " + middleNames.get(random.nextInt(middleNames.size())) + " "  + lastNames.get(random.nextInt(lastNames.size()));
    }
}
