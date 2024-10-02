import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Calculate and print the factorial
        long factorial = calculateFactorial(num);
        System.out.println("Factorial of " + num + " is: " + factorial);

        scanner.close();
    }

    // Function to calculate the factorial of a number
    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
