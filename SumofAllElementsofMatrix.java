package softuni.homeworks;

import java.util.Scanner;

public class SumofAllElementsofMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] matrixSize = input.nextLine().split(", ");//четем входа на данните и ги парсваме
        int rows = Integer.parseInt(matrixSize[0]);//четем редовете на матрицата
        int cols = Integer.parseInt(matrixSize[1]);//четем колоните на матрицата
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            String[] singleRow = input.nextLine().split(", ");//пълним редеовете на матрицата

            for (int j = 0; j < singleRow.length; j++) {//пълним колоните на мартицата
                sum += Integer.parseInt(singleRow[j]);
            }
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }

}
