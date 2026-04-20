#include <iostream>
using namespace std;

int main() {
    int rows, cols;

    cout << "enter number of rows: " << endl;
    cin >> rows;

    cout << "enter number of columns: " << endl;
    cin >> cols;

    int m[rows][cols];

    cout << "enter matrix elements: " << endl;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            cin >> m[i][j];
        }
    }

    cout << "your entered matrix: " << endl;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            cout << m[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}