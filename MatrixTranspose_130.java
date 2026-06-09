// Write a program to perform transpose of a matrix.

public class MatrixTranspose_130 {
    public static void main(String[] args) {

        int matrix[][] = {
                {1, 2, 3},
                {4, 5, 6}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}