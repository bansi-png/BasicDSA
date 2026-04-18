#include <iostream>
using namespace std;

int main() {
    int rows, cols;

    cout << "Enter size of rows: " << endl;
    cin >> rows;

    cout << "Enter size of columns: " << endl;
    cin >> cols;

    int matrix[rows][cols];

    cout << "enter matrix elements: " << endl;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            cin >> matrix[i][j];
        }
    }

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            cout << matrix[i][j] << "  ";
        }
        cout << endl;
    }

    return 0;
}