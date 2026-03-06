import java.util.Scanner;

public class Task4_CurrencyConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double rupees, result;
        int choice;

        System.out.println("Currency Converter");
        System.out.println("Enter amount in INR: ");
        rupees = sc.nextDouble();

        System.out.println("\nConvert INR to:");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        System.out.println("3. GBP");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch(choice) {

            case 1:
                result = rupees * 0.012; 
                System.out.println("Amount in USD: " + result);
                break;

            case 2:
                result = rupees * 0.011;
                System.out.println("Amount in EUR: " + result);
                break;

            case 3:
                result = rupees * 0.0095;
                System.out.println("Amount in GBP: " + result);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}