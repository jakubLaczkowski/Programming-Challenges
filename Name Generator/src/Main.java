import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        NameReader nameReader = new NameReader();
        NameGenerator nameGenerator = new NameGenerator();
        ArrayList<String> firstNames = nameReader.firstNameList();
        ArrayList<String> middleNames = nameReader.middleNameList();
        ArrayList<String> lastNames = nameReader.lastNameList();

        System.out.println(nameGenerator.generateName(firstNames, middleNames, lastNames));
        nameReader.closeScanner();
    }
}
