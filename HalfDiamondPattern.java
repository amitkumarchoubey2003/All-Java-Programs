public class HalfDiamondPattern {
    public static void main(String[] args) {
        int size = 10;
        printHalfDiamond(size);
    }

    public static void printHalfDiamond(int size) {
        // Print upper half of diamond
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Print lower half of diamond
        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
