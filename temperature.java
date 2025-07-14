import java.util.Scanner;

public class temperature {

        public static double celsiusToFahrenheit(double celsius) {           //Convert celsius to fahrenheit 
            return (celsius * 9/5) + 32;
        }

        public static double fahrenheitToCelsius(double fahrenheit) {       //Convert fahrenheit to celsius 
            return (fahrenheit - 32) * 5/9;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello welcom to Temperature Converter");
        System.out.println("please select the variation:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        
        int choice = scanner.nextInt();
        double temperature;

        switch (choice) {        //run a switch case
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                temperature = scanner.nextDouble();
                double fahrenheit = celsiusToFahrenheit(temperature);
                System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", temperature, fahrenheit);
                break;

            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = scanner.nextDouble();
                double celsius = fahrenheitToCelsius(temperature);
                System.out.printf("%.2f Fahrenheit is %.2f Celsius%n", temperature, celsius);
                break;

            default:
                System.out.println("Invalid choice.");   //for invaild choice
        }

        scanner.close();
    }

}
