#include <iostream>
using namespace std;

int linearSearch(int arr[], int size, int target) {
    for (int i = 0; i < size; i++) {
        if (arr[i] == target) {
            return i;
        }
    }
    return -1;
}

int main() {
    int maxSize;

    cout << "Enter your array size: " << endl;
    cin >> maxSize;

    int arr[maxSize];

    cout << "enter array elements: " << endl;
    for (int i = 0; i < maxSize; i++) {
        cin >> arr[i];
    }

    cout << endl;

    for (int a = 0; a < maxSize; a++) {
        cout << arr[a] << "  ";
    }

    cout << endl;

    int target;
    cout << "enter number to search: " << endl;
    cin >> target;

    int result = linearSearch(arr, maxSize, target);

    if (result == -1) {
        cout << "no such element found." << endl;
    } else {
        cout << "element at index: " << result << endl;
    }

    return 0;
}