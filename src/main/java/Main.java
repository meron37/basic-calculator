

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Ask for first number
        System.out.println("Enter the first number:");
        double firstNumber = myScanner.nextDouble();

        // Ask for second number
        System.out.println("Enter the second number:");
        double secondNumber = myScanner.nextDouble();

        // Show calculation options
        System.out.println("\nPossible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.print("Please select an option: ");
        String option = myScanner.next();  // Read the option

        // For this exercise: always multiply
        double result = firstNumber * secondNumber;
        System.out.println("\n" + firstNumber + " * " + secondNumber + " = " + result);

        myScanner.close();
    }
}
