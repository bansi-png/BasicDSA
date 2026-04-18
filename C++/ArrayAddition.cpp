#include <iostream>
using namespace std;

int main() {
    int maxSize;

    cout << "enter array size: " << endl;
    cin >> maxSize;

    int arrA[maxSize], arrB[maxSize], arrC[maxSize];

    cout << "enter array A elements: " << endl;
    for (int i = 0; i < maxSize; i++) {
        cin >> arrA[i];
    }

    cout << "enter array B elements: " << endl;
    for (int j = 0; j < maxSize; j++) {
        cin >> arrB[j];
    }

    for (int m = 0; m < maxSize; m++) {
        arrC[m] = arrA[m] + arrB[m];
    }

    cout << "Resultant Array: " << endl;
    for (int x = 0; x < maxSize; x++) {
        cout << arrC[x] << " " << endl;
    }

    return 0;
}