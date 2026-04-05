
    
import java.util.Scanner;

public class AlternateTraversal {

    // Task: Print the matrix in an alternate Left-to-Right / Right-to-Left pattern
    public void printAlternate(int[][] mat, int m, int n) {
        boolean isFirstElement = true;

        for (int i = 0; i < m; i++) {
            // Even rows (0, 2, 4...): Traverse Left to Right
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    // Formatting to ensure single spaces between numbers and no trailing space
                    if (!isFirstElement) System.out.print(" ");
                    System.out.print(mat[i][j]);
                    isFirstElement = false;
                }
            } 
            // Odd rows (1, 3, 5...): Traverse Right to Left
            else {
                for (int j = n - 1; j >= 0; j--) {
                    if (!isFirstElement) System.out.print(" ");
                    System.out.print(mat[i][j]);
                    isFirstElement = false;
                }
            }
        }
        System.out.println(); // Move to the next line after the full traversal
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read matrix dimensions M and N
        if (sc.hasNextInt()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            
            int[][] mat = new int[m][n];
            
            // Read matrix elements
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    mat[i][j] = sc.nextInt();
                }
            }
            
            AlternateTraversal solver = new AlternateTraversal();
            solver.printAlternate(mat, m, n);
        }
        
        sc.close();
    }
}
