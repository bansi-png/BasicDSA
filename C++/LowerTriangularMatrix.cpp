#include <iostream>
using namespace std;

// this program checks if it is a lower triangular matrix or not

int main() {
    int n;
    cout << "Enter the size of the matrix: ";
    cin >> n;

    int i, j;
    int arr[n][n];

    cout << "Enter elements of the matrix: " << endl;
    for (i = 0; i < n; i++) {
        cout << "Enter Row " << (i + 1) << " :" << endl;
        for (j = 0; j < n; j++) {
            cin >> arr[i][j];
        }
    }

    cout << "The Matrix is:" << endl;
    for (i = 0; i < n; i++) {
        for (j = 0; j < n; j++) {
            cout << arr[i][j] << "\t";
        }
        cout << endl;
    }

    bool isTriangular = true;
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
        cout << "The Matrix is Lower Triangular" << endl;
    } else {
        cout << "The Matrix is not Lower Triangular" << endl;
    }

    return 0;
}