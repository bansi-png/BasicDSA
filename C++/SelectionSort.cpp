#include <iostream>
using namespace std;

void selectionSort(int arr[], int n) {
    int i, j, temp;

    for (i = 0; i < n - 1; i++) {
        int minIndex = i;
        for (j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
}

void printArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        cout << arr[i] << "  ";
    }
    cout << endl;
}

int main() {
    int maxSize;

    cout << "enter size of array: " << endl;
    cin >> maxSize;

    int arr[maxSize];

    cout << "enter array elements: " << endl;
    for (int i = 0; i < maxSize; i++) {
        cin >> arr[i];
    }

    cout << "original array: " << endl;
    printArray(arr, maxSize);

    selectionSort(arr, maxSize);

    cout << "sorted array: " << endl;
    printArray(arr, maxSize);

    return 0;
}