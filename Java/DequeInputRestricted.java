import java.util.*;

// double ended queue - input restricted (DEQUE)
// one side - input (rear) - enqueue
// two side - output - delete (front, rear) - dequeue

public class DequeInputRestricted {
    int front, rear, maxSize;
    int[] queue;

    DequeInputRestricted(int size) {
        maxSize = size;
        front = -1;
        rear = -1;
        queue = new int[maxSize];
    }

    public void insert_rear(int value) {
        if((rear == maxSize - 1 && front == 0) || (front == rear -1)) {
            System.out.print("queue overflow");
        } else {
            if(rear == -1 && front == -1) {
                rear = 0;
                front = 0;
            } else if(rear == maxSize - 1 && front != 0) {
                rear = 0;
            } else {
                rear ++;
            }
        }
        queue[rear] = value;
        System.out.println(value + " inserted");
    }

    public void delete_front() {
        if(rear == -1 && front == -1){
            System.out.println("queue underflow");
            return;
        } else {
            System.out.println(queue[front] + " removed");
            if(front == rear) {
                front = -1;
                rear = -1;
            } else if (front == maxSize - 1 && front != rear) {
                front = 0;
            } else {
                front ++;
            }
        }
    }

    public void delete_rear() {
        if(front == -1 && rear == -1) {
            System.out.println("queue underflow");
            return;
        } else {
            System.out.println(queue[rear] + " removed");
            if(front == rear) {
                front = -1;
                rear = -1;
            } else if(rear == maxSize - 1 && front != rear) {
                rear = 0;
            } else {
                rear --;
            }
        }
    }

    public void display() {
        if(front == -1 && rear == -1) {
            System.out.println("queue is empty");
            return;
        } else {
            System.out.println("queue elements: ");
            if(front <= rear) {
                for(int i = front; i <= rear; i++) {
                    System.out.println(queue[i] + "  ");
                }
            } else {
                for(int i = front; i < maxSize; i++) {
                    System.out.println(queue[i] + "  ");
                }

                for(int i = 0; i < rear; i++) {
                    System.out.println(queue[i] + "  ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of queue: ");
        int size = sc.nextInt();

        DequeInputRestricted var = new DequeInputRestricted(size);

        int choice, value;

        while (true) {
            System.out.println("Enter your choice: ");
            System.out.println("1. Insert from rear");
            System.out.println("2. Delete from front");
            System.out.println("3. Delete from rear");
            System.out.println("4. Display");
            System.out.println("5. exit");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("---INSERT FROM REAR---");
                    System.out.println("enter value: ");
                    value = sc.nextInt();
                    var.insert_rear(value);
                    break;

                case 2: 
                    System.out.println("---DELETE FROM FRONT---");
                    var.delete_front();
                    break;

                case 3:
                    System.out.println("---DELETE FROM REAR---");
                    var.delete_rear();
                    break;

                case 4:
                    System.out.println("---DISPLAY FUNCTION---");
                    var.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("invalid choice");
            }
        }
    }
}