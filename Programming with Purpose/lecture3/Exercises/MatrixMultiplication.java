
public class MatrixMultiplication {
    public static void main(String[] args) {
        double[][] leftMatrix = {
            {-3, -1,  2},
            {-3, -3, -1},
            { 1, -2, -3},
            { 2,  1, -2},
        };

        double[][] rightMatrix = {
            {-2, -2},
            {-3, -3},
            {-3, -3},
        };

        if (leftMatrix[0].length != rightMatrix.length) {
            System.out.println(
                "Matrixes cannot be multiplied, because number of columns of A does not equal number of rows of B"
            );
            return;
        }

        int m = leftMatrix.length;
        int n = rightMatrix[0].length;
        double[][] result = new double[m][n];
        
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.println("row: " + i + " " + "column: " + j);
                for (int k = 0; k < rightMatrix.length; k++) {
                    System.out.print(leftMatrix[i][k] + "\t");
                    System.out.print(rightMatrix[k][j] + "\t");
                    System.out.print(leftMatrix[i][k] * rightMatrix[k][j]);
                    System.out.println();
                    result[i][j] += leftMatrix[i][k] * rightMatrix[k][j];
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}