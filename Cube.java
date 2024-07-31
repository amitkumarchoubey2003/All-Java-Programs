import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int cube = 0;

        for (int i = 0; i < num; i++) {
            cube += num * num;
        }

        System.out.println("The cube of " + num + " is: " + cube);
    }
}
