import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int numTerms = scanner.nextInt();
        scanner.close();

        System.out.println("Fibonacci sequence up to " + numTerms + " terms:");
        long[] fibSequence = new long[numTerms];
        fibSequence[0] = 0;
        fibSequence[1] = 1;

        for (int i = 2; i < numTerms; i++) {
            fibSequence[i] = fibSequence[i - 1] + fibSequence[i - 2];
        }

        for (int i = 0; i < numTerms; i++) {
            System.out.print(fibSequence[i] + " ");
        }
    }
}
