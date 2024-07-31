import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int num = scanner.nextInt();
        scanner.close();

        if (num < 0) {
            System.out.println("No: Factorial is not found.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + num + " = " + factorial);
        }
    }
}
