import java.util.Scanner;

public class SquareRootCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to find its square root: ");
        double number = scanner.nextDouble();

        // Calculate the square root
        double squareRoot = Math.sqrt(number);

        // Display the result
        System.out.println("The square root of " + number + " is: " + squareRoot);

        // Close the Scanner
        scanner.close();
    }
}
