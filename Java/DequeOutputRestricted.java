import java.util.Scanner;

// double ended queue - output restricted
// insert from rear and front
// delete from front

public class DequeOutputRestricted {
    int front, rear, maxSize;
    int queue[];

    DequeOutputRestricted(int size) {
        maxSize = size;
        front = -1;
        rear = -1;
        int queue[] = new int[maxSize];
    }

    public void insert_rear(int value) {
        if((front == 0 && rear == maxSize - 1) || (front == rear -1)) {
            System.out.println("queue overflow");
            return;
        } else {
            if(front == -1 && rear == -1) {
                front = 0;
                rear = 0;
            } else if(rear == maxSize - 1 && front != 0) {
                rear = 0;
            } else {
                rear ++;
            }
        }
        queue[rear] = value;
        System.out.println("inserted: " + value);
    }

    public void delete_front() {
        if((front == -1) && (rear == -1)) {
            System.out.println("queue underflow");
            return;
        } else {
            System.out.println("removed " + queue[front]);
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

    public void insert_front(int value) {
        if((front == 0 && rear == maxSize - 1) || (front == rear -1)) {
            System.out.println("queue overflow");
            return;
        } else {
            if(front == -1 && rear == -1) {
                front = 0;
                rear = 0;
            } else if(front == 0) {
                front = 0;
            } else {
                front --;
            }
        }
        queue[front] = value;
        System.out.println("inserted: " + value);
    }

    public void display() {
        if(front == -1 && rear == -1) {
            System.out.println("queue underflow");
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
                for(int i = 0; i <= rear; i++) {
                    System.out.println(queue[i] + "  ");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of queue: ");
        int size = sc.nextInt();

        DequeOutputRestricted demo = new DequeOutputRestricted(size);
        int value;

        while(true) {
            System.out.println("enter your choice: ");
            System.out.println("1. insert from rear");
            System.out.println("2. insert from front");
            System.out.println("3. delete from front");
            System.out.println("4. display");
            System.out.println("5. exit");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("---INSERT FROM REAR---");
                    System.out.println("enter value: ");
                    value = sc.nextInt();
                    demo.insert_rear(value);
                    break;

                case 2:
                    System.out.println("---INSERT FROM FRONT---");
                    System.out.println("enter value: ");
                    value = sc.nextInt();
                    demo.insert_front(value);
                    break;

                case 3:
                    System.out.println("---DELETE FROM FRONT---");
                    demo.delete_front();
                    break;

                case 4:
                    System.out.println("---DISPLAY FUNCTION---");
                    demo.display();
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