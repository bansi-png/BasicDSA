import java.util.Scanner;

// this program checks if it is a lower triangular matrix or not

public class LowerTriangularMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the matrix: ");
        int n = sc.nextInt();

        int i, j;
        int arr[][] = new int[n][n];
        
        System.out.println("Enter elements of the matrix: ");
        for (i = 0; i < n; i++) {
            System.out.println("Enter Row "+ (i+1) + " :");
            for (j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("The Matrix is:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        
        boolean isTriangular = true;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if ((i < j && arr[i][j] != 0) || (i >= j && arr[i][j] == 0)) {
                    isTriangular = false;
                    break;
                }
            }            
            if (!isTriangular) {
                break;
            }
        }
        
        if (isTriangular) {
            System.out.println("The Matrix is Lower Triangular");
        } else {
            System.out.println("The Matrix is not Lower Triangular");
        }
    }
}