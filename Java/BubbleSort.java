import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        boolean swapped;

        for(int i = 0; i < n - 1; i++) {
            swapped = false;

            for(int j = 0; j < n - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }

    public static void printArray(int[] arr) {
        for(int value : arr) {
            System.out.print(value + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter array elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("original array: ");
        printArray(arr);

        bubbleSort(arr);
        System.out.println("sorted array: ");
        printArray(arr);
    }
}