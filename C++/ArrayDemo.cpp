#include <iostream>
using namespace std;

int main() {
    int maxSize;

    cout << "enter size of array: " << endl;
    cin >> maxSize;

    int arr[maxSize];

    cout << "enter array elements: " << endl;
    for (int i = 0; i < maxSize; i++) {
        cin >> arr[i];
    }

    cout << "your entered array: " << endl;
    for (int a = 0; a < maxSize; a++) {
        cout << arr[a] << "  ";
    }

    return 0;
}