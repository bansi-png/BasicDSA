import java.util.Scanner;

public class MatrixDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number of rows: ");
        int rows = sc.nextInt();

        System.out.println("enter number of columns: ");
        int cols = sc.nextInt();

        int[][] m = new int[rows][cols];

        System.out.println("enter matrix elements: ");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        System.out.println("your entered matrix: ");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}