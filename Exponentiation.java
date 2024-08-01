import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base (a): ");
        int a = scanner.nextInt();
        System.out.println("Enter the exponent (b): ");
        int b = scanner.nextInt();

        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }

        System.out.println("Result: " + result);
    }
}
