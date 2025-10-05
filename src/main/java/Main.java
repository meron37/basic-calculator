

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter num1: ");
      float num1 = myScanner.nextFloat();
        System.out.print("Enter num2: ");
      float num2 = myScanner.nextFloat();
      // Ask user if they want to add, subtract,multiply or divide.
        System.out.println("Possible calculations:");
        System.out.println("(A) add");
        System.out.println("(B) subtract");
        System.out.println("(C) multiply");
        System.out.println("(D) divide");


//        System.out.println(num1 * num2);
        System.out.print("Please select an option: ");
        String option = myScanner.next();  // Read the option

        // For this exercise: always multiply
        double result = num1 * num2;
        System.out.println("\n" + num1 + " * " + num2 + " = " + result);

    }
}
