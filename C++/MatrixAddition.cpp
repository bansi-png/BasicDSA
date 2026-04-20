#include <iostream>
using namespace std;

int main() {
    int rows, cols;

    cout << "enter number of rows: " << endl;
    cin >> rows;

    cout << "enter number of columns: " << endl;
    cin >> cols;

    int a[rows][cols], b[rows][cols], c[rows][cols];

    cout << "enter elements of Matrix A: " << endl;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            cin >> a[i][j];
        }
    }

    cout << "enter elements of Matrix b: " << endl;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            cin >> b[i][j];
        }
    }

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            c[i][j] = a[i][j] + b[i][j];
        }
    }

    cout << "Resultant Matrix: " << endl;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            cout << c[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}