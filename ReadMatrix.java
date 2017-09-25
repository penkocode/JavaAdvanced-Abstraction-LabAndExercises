package softuni.homeworks;

import java.util.Scanner;

public class ReadMatrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rows = Integer.parseInt(input.nextLine());
        int cols = Integer.parseInt(input.nextLine());

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            //read row by row
            String[] singleRow = input.nextLine().split("\\w+");

            for (int j = 0; j <singleRow.length; j++) {
                //fill row by row
                matrix[i][j] = Integer.parseInt(singleRow[j]);


            }

        }

    }

}
