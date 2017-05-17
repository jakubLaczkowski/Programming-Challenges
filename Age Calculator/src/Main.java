import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
public class Main {

    public static void main(String[] args) {
        int day;
        int month;
        int year;
        int age;
        LocalDate birthDay;
        LocalDate currentDate = LocalDate.now();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year of your birth:");
        year = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the month of your birth:");
        month = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the day of your birth:");
        day = Integer.parseInt(scanner.nextLine());
        scanner.close();

        birthDay = LocalDate.of(year, month, day);
        age = Period.between(birthDay, currentDate).getYears();
        System.out.println("You're " + age + " years old.");

    }
}
