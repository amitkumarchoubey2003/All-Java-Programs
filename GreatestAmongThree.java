import java.util.Scanner;

public class GreatestAmongThree {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Check for the greatest number using nested if-else statements
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num1 + " is the greatest number.");
            } else {
                System.out.println(num3 + " is the greatest number.");
            }
        } else {
            if (num2 > num3) {
                System.out.println(num2 + " is the greatest number.");
            } else {
                System.out.println(num3 + " is the greatest number.");
            }
        }

        // Close the Scanner
        scanner.close();
    }
}
