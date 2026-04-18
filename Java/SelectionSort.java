import java.util.Scanner;

class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        int i, j, temp;

        for(i = 0; i < n - 1; i++) {
            int minIndex = i;
            for(j = i + 1; j < n; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for(int value : arr) {
            System.out.print(value + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int[] arr = {85, 20, 96, 32, 8};

        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array: ");
        int maxSize = sc.nextInt();

        int[] arr = new int[maxSize];

        System.out.println("enter array elements: ");
        for(int i = 0; i < maxSize; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("original array: ");
        printArray(arr);

        selectionSort(arr);

        System.out.println("sorted array: ");
        printArray(arr);
    }
}