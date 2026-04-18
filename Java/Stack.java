import java.util.Scanner;

class Stack {
    static class stackArray {
        int top, maxSize;
        int[] arr;

        stackArray(int size) {
            maxSize = size;
            arr = new int[maxSize];
            top = -1;
        }

        public void push(int value) {
            if(top == maxSize - 1) {
                System.out.println("Stack Overflow.");
            } else {
                top++;
                arr[top] = value;
                System.out.println("value pushed: " + value);
            }
        }

        public void pop() {
            if(top == -1) {
                System.out.println("Stack Underflow.");
            } else {
                int value = arr[top];
                top--;
                System.out.println("value popped: " + value);
            }
        }

        public void displayStack() {
            if(top == -1) {
                System.out.println("Stack Underflow.");
            } else {
                for(int i = 0; i <= top; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
        }

        public void peek() {
            if(top == -1) {
                System.out.println("Stack Underflow.");
            } else {
                System.out.println("Top element: " + arr[top]);
            }
        }

        public boolean isFull() {
            if(top == maxSize - 1) return true;
            else return false;
        }

        public boolean isEmpty() {
            if(top == -1) return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of stack: ");
        int maxSize = sc.nextInt();

        stackArray var = new stackArray(maxSize);

        while(true) {
            System.out.println("enter your choice: ");
            System.out.println("1. push; 2. pop; 3. peek; 4. display; 5. isFull; 6. isEmpty; 7. exit");
            int choice = sc.nextInt();

            switch(choice) {
                case 1: 
                    System.out.println("---PUSH FUNCTION---");
                    System.out.println("enter value to push in stack: ");
                    int value = sc.nextInt();
                    var.push(value);
                    break;

                case 2:
                    System.out.println("---POP FUNCTION---");
                    var.pop();
                    break;

                case 3:
                    System.out.println("---PEEK FUNCTION---");
                    var.peek();
                    break;

                case 4:
                    System.out.println("---DISPLAY FUNCTION---");
                    var.displayStack();
                    break;

                case 5:
                    System.out.println("---IS FULL FUNCTION---");
                    System.out.println(var.isFull());
                    break;

                case 6:
                    System.out.println("---IS EMPTY FUNCTION---");
                    System.out.println(var.isEmpty());
                    break;

                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);
                
                default:
                    System.out.println("invalid choice!");
            }
        }
    }
}