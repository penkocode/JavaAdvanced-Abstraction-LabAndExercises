package softuni.homeworks;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        long[][] pascalTriangle = pascalsTriangleissue(n);

        for (long[] rows : pascalTriangle) {
            for (long element : rows) {
                if (element != 0) {
                    System.out.print(element + " ");
                }

            }
            System.out.println();
        }
    }

    private static long[][] pascalsTriangleissue(int n) {
        long[][] result = new long[n][n];

        for (int row = 0; row < n; row++) {

            result[row][0] = 1;
            result[row][row] = 1;
            if (row > 1) {
                for (int col = 1; col < n; col++) {
                    long[] prevRow = result[(row - 1)];
                    long sum = prevRow[col - 1] + prevRow[col];
                    result[row][col] = sum;
                }
            }
        }

        return result;
    }
}
