import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by kuba on 2017-05-06.
 */
public class NameReader {

    private Scanner scanner = new Scanner(System.in);

    public ArrayList<String> firstNameList(){
        int listSize;
        ArrayList<String> firstNames = new ArrayList<>();
        System.out.println("How many first names would you like to add to the list?");
        listSize = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i<listSize; i++){
            System.out.println("Enter name:");
            firstNames.add(scanner.nextLine());
        }
        return firstNames;
    }

    public ArrayList<String> middleNameList(){
        int listSize;
        ArrayList<String> middleNames = new ArrayList<>();
        System.out.println("How many middle names would you like to add to the list?");
        listSize = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i<listSize; i++){
            System.out.println("Enter name:");
            middleNames.add(scanner.nextLine());
        }
        return middleNames;
    }

    public ArrayList<String> lastNameList(){
        int listSize;
        ArrayList<String> lastNames = new ArrayList<>();
        System.out.println("How many last names would you like to add to the list?");
        listSize = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i<listSize; i++){
            System.out.println("Enter name:");
            lastNames.add(scanner.nextLine());
        }
        return lastNames;
    }

    public void closeScanner(){
        scanner.close();
    }
}
