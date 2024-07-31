import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a limit: ");
        int limit = scanner.nextInt();
        scanner.close();

        int sum = 0;

        for (int i = 1; i <= limit; i++) {
            sum += i;
        }

        System.out.println("Sum of natural numbers up to " + limit + ": " + sum);
    }
}
