import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        if (num < 5) {
            int square = num * num;
            System.out.println("The square of " + num + " is: " + square);
        } else {
            int cube = num * num * num;
            System.out.println("The cube of " + num + " is: " + cube);
        }
    }
}
