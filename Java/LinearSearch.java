import java.util.Scanner;

class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your array size: ");
        int maxSize = sc.nextInt();

        int[] arr = new int[maxSize];

        System.out.println("enter array elements: ");
        for(int i = 0; i < maxSize; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println();

        for(int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + "  ");
        }

        System.out.println();

        System.out.println("enter number to search: ");
        int target = sc.nextInt();

        int result = linearSearch(arr, target);

        if(result == -1) {
            System.out.println("no such element found.");
        } else {
            System.out.println("element at index: " + result);
        }
    }
}