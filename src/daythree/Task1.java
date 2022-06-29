package daythree;

public class Task1 {

    public static void main(String[] args) {

        int[][] twoDimensionalArray = new int[10][10];
        for (int c = 0; c < 10; c++) {
            for (int r = 0; r < 10; r++) {
                twoDimensionalArray[c][r] = (c + 1) * (r + 1);
                System.out.printf("%d * %d = %d%n", (c + 1), (r + 1), twoDimensionalArray[c][r]);
            }
        }
    }
}
