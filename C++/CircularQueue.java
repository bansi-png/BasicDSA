#include <iostream>
using namespace std;

class circularQueue {
public:
    int front, rear, maxSize;
    int* queue;

    circularQueue(int size) {
        maxSize = size;
        front = -1;
        rear = -1;
        queue = new int[maxSize];
    }

    ~circularQueue() {
        delete[] queue;
    }

    void enqueue(int value) {
        if (((rear == maxSize - 1) && (front == 0)) || (front == rear - 1)) {
            cout << "queue overflow" << endl;
        } else {
            if (front == -1 && rear == -1) {
                front = 0;
                rear = 0;
            } else if (front != 0 && rear == maxSize - 1) {
                rear = 0;
            } else {
                rear++;
            }
        }
        queue[rear] = value;
        cout << "inserted: " << value << endl;
    }

    void dequeue() {
        if (front == -1 && rear == -1) {
            cout << "stack underflow" << endl;
        } else {
            if (front == rear) {
                front = -1;
                rear = -1;
            } else if (front == maxSize - 1 && front != rear) {
                front = 0;
            } else {
                front++;
            }
        }
    }

    void display() {
        if (front <= rear) {
            for (int i = front; i <= rear; i++) {
                cout << queue[i] << " ";
            }
        } else {
            for (int i = front; i < maxSize; i++) {
                cout << queue[i] << " ";
            }
            for (int i = 0; i <= rear; i++) {
                cout << queue[i] << " ";
            }
        }
        cout << endl;
    }

    bool isEmpty() {
        if (front == -1 && rear == -1) {
            return true;
        } else return false;
    }

    bool isFull() {
        if (((rear == maxSize - 1) && (front == 0)) || (front == rear - 1)) {
            return true;
        } else return false;
    }
};

int main() {
    int size;
    cout << "enter size of circular queue: " << endl;
    cin >> size;

    circularQueue var(size);

    while (true) {
        cout << "Enter a choice: " << endl;
        cout << "1.Enqueue; 2.Dequeue; 3.Display; 4.isEmpty; 5.isFull; 6.Exit" << endl;

        int choice;
        cin >> choice;

        switch (choice) {
            case 1: {
                cout << "---ENQUEUE FUNCTION---" << endl;
                cout << "Enter value to enqueue: " << endl;
                int val;
                cin >> val;
                var.enqueue(val);
                break;
            }
            case 2:
                cout << "---DEQUEUE FUNCTION---" << endl;
                var.dequeue();
                break;

            case 3:
                cout << "---DISPLAY FUNCTION---" << endl;
                var.display();
                break;

            case 4:
                cout << "---IS EMPTY FUNCTION---" << endl;
                cout << (var.isEmpty() ? "true" : "false") << endl;
                break;

            case 5:
                cout << "---IS FULL FUNCTION---" << endl;
                cout << (var.isFull() ? "true" : "false") << endl;
                break;

            case 6:
                cout << "Exiting..." << endl;
                return 0;

            default:
                cout << "Invalid choice!" << endl;
        }
    }

    return 0;
}