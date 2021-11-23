package Lab1.Task5;

public class Task5 {
    public static void main(final String[] args) {

        final int [][] Matr = new int[3][];
        final int [][] tMatr = new int[3][];
        System.out.println("Matrix: ");

        for (int i = 0; i < Matr.length; i++) {
            Matr[i] = new  int[3];
            tMatr[i] = new  int[3];                     /* Ввід матриці */
            for (int j = 0; j < Matr.length; j++) {
                Matr[i][j] = (int)Math.round(Math.random()*10);
                System.out.print(Matr[i][j] + "  ");
            }
            System.out.println();
        }

        for (int i = 0; i < Matr.length; i++) {
            for (int j = 0; j < Matr.length; j++) {
                tMatr[i][j] = Matr[j][i];   /* Транспонування матриці*/
            }
        }

        System.out.println("TMatrix: ");
        for (int i = 0; i < tMatr.length; i++){
            for (int j = 0; j < tMatr.length; j++) {
                System.out.print(tMatr[i][j] + "  "); /* Вивід результата */
            }
            System.out.println();
        }
    }
}
