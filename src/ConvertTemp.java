import java.util.Scanner;

public class ConvertTemp {
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius +32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenhiet){
        double celsius = (5.0 / 9) * (fahrenhiet -32);
        return celsius;
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice;");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                System.exit(0);
            }
        }while (choice != 0);
    }
    }

