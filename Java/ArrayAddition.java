import java.util.Scanner;

class ArrayAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array size: ");
        int maxSize = sc.nextInt();

        int[] arrA = new int[maxSize];
        int[] arrB = new int[maxSize];
        int[] arrC = new int[maxSize];

        System.out.println("enter array A elements: ");
        for(int i = 0; i < maxSize; i++) {
            arrA[i] = sc.nextInt();
        }

        System.out.println("enter array B elements: ");
        for(int j = 0; j < maxSize; j++) {
            arrB[j] = sc.nextInt();
        }

        for (int m = 0; m < maxSize; m++) {
            arrC[m] = arrA[m] + arrB[m];
        }

        System.out.println("Resultant Array: ");
        for(int x = 0; x < arrC.length; x++) {
            System.out.println(arrC[x] + " ");
        }
    }
}