#include <iostream>
using namespace std;

void bubbleSort(int arr[], int n) {
    bool swapped;

    for (int i = 0; i < n - 1; i++) {
        swapped = false;

        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = true;
            }
        }
        if (!swapped) break;
    }
}

void printArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        cout << arr[i] << "  ";
    }
    cout << endl;
}

int main() {
    int n;
    cout << "enter array size: " << endl;
    cin >> n;

    int arr[n];

    cout << "enter array elements: " << endl;
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    cout << "original array: " << endl;
    printArray(arr, n);

    bubbleSort(arr, n);
    cout << "sorted array: " << endl;
    printArray(arr, n);

    return 0;
}