import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String option;
        double temperature;
        TemperatureConverter tempConv = new TemperatureConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which temperature conversion are you interested in?");
        System.out.println("1. Celsius to Kelvin\n" +
                "2. Celsius to Fahrenheit\n" +
                "3. Kelvin to Fahrenheit\n" +
                "4. Kelvin to Celsius\n" +
                "5. Fahrenheit to Celsius\n" +
                "6. Fahrenheit to Kelvin");
        option = scanner.nextLine();

        System.out.println("Enter temperature to convert:");
        temperature = scanner.nextDouble();
        scanner.close();

        switch(option){
            case "1":
                System.out.println(tempConv.celsiusToKelvin(temperature));
                break;
            case "2":
                System.out.println(tempConv.celsiusToFahrenheit(temperature));
                break;
            case "3":
                System.out.println(tempConv.kelvinToFahrenheit(temperature));
                break;
            case "4":
                System.out.println(tempConv.kelvinToCelsius(temperature));
                break;
            case "5":
                System.out.println(tempConv.fahrenheitToCelsius(temperature));
                break;
            case "6":
                System.out.println(tempConv.fahrenheitToKelvin(temperature));
                break;
        }

    }
}
