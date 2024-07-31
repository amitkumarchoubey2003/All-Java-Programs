import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int square = 0;

        for (int i = 0; i < num; i++) {
            square += num;
        }

        System.out.println("The square of " + num + " is: " + square);
    }
}
