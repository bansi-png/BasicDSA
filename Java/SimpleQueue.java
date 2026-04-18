import java.util.Scanner;

public class SimpleQueue {

    static class QueueArray {
        int front, rear, maxSize;
        int[] arr;

        QueueArray(int size) {
            maxSize = size;
            front = -1;
            rear = -1;
            arr = new int[maxSize];
        }

        public void enqueue(int value) {
            if (rear == maxSize - 1) {
                System.out.println("Queue Overflow.");
            } else {
                if (front == -1 && rear == -1) {
                    front = 0;
                    rear = 0;
                } else {
                    rear++;
                }
                arr[rear] = value;
                System.out.println("Value inserted: " + value);
            }
        }

        public void dequeue() {
            if (front == -1 && rear == -1) {
                System.out.println("Queue Underflow.");
            } else {
                System.out.println(arr[front] + " deleted");
                if (front == rear) {
                    front = rear = -1;
                } else {
                    front++;
                }
            }
        }

        public void display() {
            if (front == -1 && rear == -1) {
                System.out.println("Queue is empty.");
            } else {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }

        public void peek() {
            if (front == -1 && rear == -1) {
                System.out.println("Queue is empty.");
            } else {
                System.out.println("Front element: " + arr[front]);
            }
        }

        public boolean isEmpty() {
            if(front == -1 && rear == -1) return true;
            else return false;
        }

        public boolean isFull() {
            if(rear == maxSize - 1) return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of queue: ");
        int size = sc.nextInt();

        QueueArray var = new QueueArray(size);

        while (true) {
            System.out.println("\n1.Enqueue; 2.Dequeue; 3.Peek; 4.Display; 5.isEmpty; 6.isFull; 7.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("---ENQUEUE FUNCTION---");
                    System.out.print("Enter value: ");
                    var.enqueue(sc.nextInt());
                    break;

                case 2:
                    System.out.println("---DEQUEUE FUNCTION---");
                    var.dequeue();
                    break;

                case 3:
                    System.out.println("---PEEK FUNCTION---");
                    var.peek();
                    break;

                case 4:
                    System.out.println("---DISPLAY FUNCTION---");
                    var.display();
                    break;

                case 5:
                    System.out.println("---IS EMPTY FUNCTION---");
                    System.out.println(var.isEmpty());
                    break;

                case 6:
                    System.out.println("---IS FULL FUNCTION---");
                    System.out.println(var.isFull());
                    break;

                case 7:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}