#include <iostream>
using namespace std;

// Program to Determine if a given Matrix is a Sparse Matrix.

int main() {
    int rows, cols, size, count = 0;
    int a[][3] = {
        {1, 7, 0},
        {0, 0, 0},
        {0, 0, 6}
    };

    // Calculates number of rows and columns present in given matrix
    rows = 3;
    cols = 3;

    // Count all zero elements present in matrix
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (a[i][j] == 0)
                count++;
        }
    }

    // Calculates the size of array
    size = rows * cols;
    if (count > (size / 2))
        cout << "Given matrix is a sparse matrix" << endl;
    else
        cout << "Given matrix is not a sparse matrix" << endl;

    return 0;
}