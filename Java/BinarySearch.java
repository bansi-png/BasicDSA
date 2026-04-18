import java.util.Scanner;

// works only on sorted lists/arrays

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(arr[mid] == target) return target;

            if(arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Scanner sc = new Scanner(System.in);
        System.out.println("enter element to search from 1 to 9: ");
        int target = sc.nextInt();

        int result = binarySearch(arr, target);
        if(result != -1) {
            System.out.println("element found at index: " + result);
        } else {
            System.out.println("element not found.");
        }
    }
}