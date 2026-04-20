#include <iostream>
using namespace std;

// double ended queue - input restricted (DEQUE)
// one side - input (rear) - enqueue
// two side - output - delete (front, rear) - dequeue

class DequeInputRestricted {
public:
    int front, rear, maxSize;
    int* queue;

    DequeInputRestricted(int size) {
        maxSize = size;
        front = -1;
        rear = -1;
        queue = new int[maxSize];
    }

    ~DequeInputRestricted() {
        delete[] queue;
    }

    void insert_rear(int value) {
        if ((rear == maxSize - 1 && front == 0) || (front == rear - 1)) {
            cout << "queue overflow";
        } else {
            if (rear == -1 && front == -1) {
                rear = 0;
                front = 0;
            } else if (rear == maxSize - 1 && front != 0) {
                rear = 0;
            } else {
                rear++;
            }
        }
        queue[rear] = value;
        cout << value << " inserted" << endl;
    }

    void delete_front() {
        if (rear == -1 && front == -1) {
            cout << "queue underflow" << endl;
            return;
        } else {
            cout << queue[front] << " removed" << endl;
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

    void delete_rear() {
        if (front == -1 && rear == -1) {
            cout << "queue underflow" << endl;
            return;
        } else {
            cout << queue[rear] << " removed" << endl;
            if (front == rear) {
                front = -1;
                rear = -1;
            } else if (rear == maxSize - 1 && front != rear) {
                rear = 0;
            } else {
                rear--;
            }
        }
    }

    void display() {
        if (front == -1 && rear == -1) {
            cout << "queue is empty" << endl;
            return;
        } else {
            cout << "queue elements: " << endl;
            if (front <= rear) {
                for (int i = front; i <= rear; i++) {
                    cout << queue[i] << "  " << endl;
                }
            } else {
                for (int i = front; i < maxSize; i++) {
                    cout << queue[i] << "  " << endl;
                }
                for (int i = 0; i < rear; i++) {
                    cout << queue[i] << "  " << endl;
                }
            }
        }
    }
};

int main() {
    int size;
    cout << "enter size of queue: " << endl;
    cin >> size;

    DequeInputRestricted var(size);

    int choice, value;

    while (true) {
        cout << "Enter your choice: " << endl;
        cout << "1. Insert from rear" << endl;
        cout << "2. Delete from front" << endl;
        cout << "3. Delete from rear" << endl;
        cout << "4. Display" << endl;
        cout << "5. exit" << endl;
        cin >> choice;

        switch (choice) {
            case 1:
                cout << "---INSERT FROM REAR---" << endl;
                cout << "enter value: " << endl;
                cin >> value;
                var.insert_rear(value);
                break;

            case 2:
                cout << "---DELETE FROM FRONT---" << endl;
                var.delete_front();
                break;

            case 3:
                cout << "---DELETE FROM REAR---" << endl;
                var.delete_rear();
                break;

            case 4:
                cout << "---DISPLAY FUNCTION---" << endl;
                var.display();
                break;

            case 5:
                cout << "Exiting..." << endl;
                return 0;

            default:
                cout << "invalid choice" << endl;
        }
    }

    return 0;
}