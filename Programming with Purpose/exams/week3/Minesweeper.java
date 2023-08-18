import java.util.Random;

public class Minesweeper {
    public static void main(String[] args) {
        // Getting command line arguments
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        
        // Init
        String[][] field = new String[m][n];
        
        // Fill field with 0's
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                field[i][j] = "0";
            }
        }

        // Set k mines
        int counter = 0;
        outerloop:
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (counter == k) {
                    break outerloop;
                }
                field[i][j] = "*";
                counter++;
            }
        }

        // Shuffle mines
        Random rnd = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int x = rnd.nextInt(m);
                int y = rnd.nextInt(n);

                String temp = field[i][j];
                field[i][j] = field[x][y];
                field[x][y] = temp;
            }
        }

        // Count neighbouring mines
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if (field[i][j].equals("*")) 
                    continue;

                String[] directions = new String[8];
                directions[0] = (i-1 >= 0) ? field[i-1][j] : "";  // up
                directions[1] = (j-1 >= 0) ? field[i][j-1] : "";  // left
                directions[2] = (j+1 <= n-1) ? field[i][j+1] : "";  // right
                directions[3] = (i+1 <= m-1) ? field[i+1][j] : "";  // down
                directions[4] = (i-1 >= 0 && j-1 >= 0) ? field[i-1][j-1] : "";  // up -> left
                directions[5] = (i-1 >= 0 && j+1 <= n-1) ? field[i-1][j+1] : "";  // up -> right
                directions[6] = (i+1 <= m-1 && j-1 >= 0) ? field[i+1][j-1] : "";  // down -> left
                directions[7] = (i+1 <= m-1 && j+1 <= n-1) ? field[i+1][j+1] : "";  // down -> right
                
                int neighbourCount = 0;
                for (int x = 0; x < directions.length; x++)
                    if (directions[x].equals("*")) neighbourCount++;

                field[i][j] = Integer.toString(neighbourCount);
            }
        }

        // Print result
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(field[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
