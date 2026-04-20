import java.util.Scanner;

public class CircularQueue {
    static class circularQueue {
        int front, rear, maxSize;
        int[] queue;

        circularQueue(int size) {
            maxSize = size;
            front = -1;
            rear = -1;
            queue = new int[maxSize];
        }

        public void enqueue(int value) {
            if(((rear == maxSize - 1) && (front == 0)) || (front == rear - 1)) {
                System.out.println("queue overflow");
            } else {
                if (front == -1 && rear == -1) {
                    front = 0;
                    rear = 0;
                } else if (front != 0 && rear == maxSize -1) {
                    rear = 0;
                } else {
                    rear ++;
                }
            }
            queue[rear] = value;
            System.out.println("inserted: " + value);
        }

        public void dequeue() {
            if(front == -1 && rear == -1) {
                System.out.println("stack underflow");
            } else {
                if(front == rear) {
                    front = -1;
                    rear = -1;
                } else if(front == maxSize - 1 && front != rear) {
                    front = 0;
                } else {
                    front ++;
                }
            }
        }

        public void display() {
            if (front <= rear) {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            } else {
            for (int i = front; i < maxSize; i++) {
                System.out.print(queue[i] + " ");
            }
            
            for (int i = 0; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
        }
        System.out.println();
        }

        public boolean isEmpty() {
            if(front == -1 && rear == -1) {
                return true;
            } else return false;
        }

        public boolean isFull() {
            if(((rear == maxSize - 1) && (front == 0)) || (front == rear - 1)) {
                return true;
            } else return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of circular queue: ");
        int size = sc.nextInt();

        circularQueue var = new circularQueue(size);

        while (true) {
            System.out.println("Enter a choice: ");
            System.out.println("1.Enqueue; 2.Dequeue; 3.Display; 4.isEmpty; 5.isFull; 6.Exit");

            int choice = sc.nextInt();
            switch(choice) {
                case 1: 
                    System.out.println("---ENQUEUE FUNCTION---");
                    System.out.println("Enter value to enqueue: ");
                    int val = sc.nextInt();
                    var.enqueue(val);
                    break;
            
                case 2:
                    System.out.println("---DEQUEUE FUNCTION---");
                    var.dequeue();
                    break;

                case 3:
                    System.out.println("---DISPLAY FUNCTION---");
                    var.display();
                    break;

                case 4:
                    System.out.println("---IS EMPTY FUNCTION---");
                    var.isEmpty();
                    break;
                
                case 5:
                    System.out.println("---IS FULL FUNCTION---");
                    var.isFull();
                    break;
                
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}