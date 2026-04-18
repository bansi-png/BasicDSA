import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array: ");
        int maxSize = sc.nextInt();

        int[] arr = new int[maxSize];

        System.out.println("enter array elements: ");
        for(int i = 0; i < maxSize; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("your entered array: ");
        for(int a = 0; a < maxSize; a++) {
            System.out.print(arr[a] + "  ");
        }
    }
}