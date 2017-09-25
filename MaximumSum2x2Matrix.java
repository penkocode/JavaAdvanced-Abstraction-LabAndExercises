package softuni.homeworks;

import java.util.Scanner;

public class MaximumSum2x2Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] matrixSize = input.nextLine().split(", ");
        int rows = Integer.parseInt(matrixSize[0]);
        int cols = Integer.parseInt(matrixSize[1]);
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i <matrix.length; i++) {
            String[] singleRow = input.nextLine().split(", ");
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = Integer.parseInt(singleRow[j]);
            }
        }
        int bestResult = Integer.MIN_VALUE;
        int startRow = 0;
        int startCol = 0;
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                int sum = matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1];

                if (bestResult < sum) {
                    bestResult = sum;
                    startRow = i;
                    startCol = j;
                }

            }

        }
        System.out.println(matrix[startRow][startCol] + " " + matrix[startRow][startCol + 1]);
        System.out.println(matrix[startRow + 1][startCol] + " " + matrix[startRow + 1][startCol + 1]);
        System.out.println(bestResult);

    }
}