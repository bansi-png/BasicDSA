// Program to Determine if a given Matrix is a Sparse Matrix.

public class SparseMatrix {  
    public static void main(String[] args) {  
        int rows, cols, size, count = 0; 
        int a[][] = {     
                        {1, 7, 0},  
                        {0, 0, 0},  
                        {0, 0, 6}  
                    };  
            
        //Calculates number of rows and columns present in given matrix  
        rows = a.length;  
        cols = a[0].length;  
          
        //Count all zero element present in matrix  
        for(int i = 0; i < rows; i++) {  
            for(int j = 0; j < cols; j++) {  
                if(a[i][j] == 0)  
                    count++;  
            }  
        }  
              
        //Calculates the size of array  
        size = rows * cols;  
        if(count > (size/2))  
            System.out.println("Given matrix is a sparse matrix");  
        else  
            System.out.println("Given matrix is not a sparse matrix");  
    }  
}   
