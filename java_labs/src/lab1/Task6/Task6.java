package Lab1.Task6;

public class Task6 {
    public static void main(final String[] args) {
        final int[][] Matrix1 = {
                {3, 8, 2},
                {5, 32, -12},
                {-1, 11, 13}
        };

        final int[][] Matrix2 = {
                {-5, 4, 8,},
                {4, 1, 9,},
                {-12, 9, 8}
        };

        final Task6 matrix = new Task6();
        System.out.println("---Multiplication of matrices---");
        System.out.println("Matrix  1");
        matrix.printMatrix(Matrix1);
        System.out.println("\nMatrix 2");
        matrix.printMatrix(Matrix2);

        System.out.println("\nMultiplied matrix");
        matrix.printMatrix(matrix.multiplication(Matrix1, Matrix2));
    }

    private void printMatrix(final int[][] array) {                 /*вивід матриці на екран*/
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private int[][] multiplication(final int[][] Matrix1, final int[][] Matrix2) {
        final int r1, r2, c1, c2;
        r1 = Matrix1.length;
        c1 = Matrix1[0].length;

        r2 = Matrix2.length;
        c2 = Matrix2[0].length;

        final int[][] result;
        if (c1 != r2) {
            System.out.println("Error!");
            result = new int[0][0];
        } else {
            result = new int[r1][c2];

            for (int i = 0; i < r1; i++)
            {
                for (int j = 0; j < c2; j++)
                {
                    for (int k = 0; k < c1; k++) {
                        result[i][j] += Matrix1[i][k] * Matrix2[k][j];
                    }
                }
            }
        }

        return result;
    }

}
