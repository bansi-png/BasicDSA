#include <iostream>
using namespace std;

int partition(int a[], int low, int high) {
    int pivot = a[high];
    int i = (low - 1);

    for (int j = low; j < high; j++) {
        if (a[j] <= pivot) {
            i++;
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    int temp = a[i + 1];
    a[i + 1] = a[high];
    a[high] = temp;

    return i + 1;
}

void sort(int a[], int l, int h) {
    if (l < h) {
        int pi = partition(a, l, h);
        sort(a, l, pi - 1);
        sort(a, pi + 1, h);
    }
}

int main() {
    int a[] = {10, 7, 8, 9, 1, 5};
    int n = sizeof(a) / sizeof(a[0]);

    sort(a, 0, n - 1);

    for (int i = 0; i < n; i++)
        cout << a[i] << " ";

    return 0;
}