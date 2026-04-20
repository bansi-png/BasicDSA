#include <iostream>
using namespace std;

// this program converts a matrix to an upper triangular matrix

void printMatrix(int** arr, int m, int n) {
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            cout << arr[i][j] << " ";
        }
        cout << endl;
    }
}

void upperTriangularMatrix(int** arr, int m, int n) {
    if (m != n) {
        cout << "Matrix entered should be a Square Matrix" << endl;
        cout << "Try Again..." << endl;
        return;
    } else {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j) {
                    arr[i][j] = 0;
                }
            }
        }
        cout << "Upper Triangular Matrix is : " << endl;
        printMatrix(arr, m, n);
    }
}

int main() {
    int m, n;

    cout << "Enter the number of rows: " << endl;
    cin >> m;

    cout << "Enter the number of columns: " << endl;
    cin >> n;

    // Allocate 2D array dynamically
    int** arr = new int*[m];
    for (int i = 0; i < m; i++) {
        arr[i] = new int[n];
    }

    cout << "Enter the matrix elements: " << endl;
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            cin >> arr[i][j];
        }
    }

    cout << "Original Matrix is : " << endl;
    printMatrix(arr, m, n);

    upperTriangularMatrix(arr, m, n);

    // Free allocated memory
    for (int i = 0; i < m; i++) {
        delete[] arr[i];
    }
    delete[] arr;

    return 0;
}