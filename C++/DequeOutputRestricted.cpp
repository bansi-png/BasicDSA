#include <iostream>
using namespace std;

// double ended queue - output restricted
// insert from rear and front
// delete from front

class DequeOutputRestricted {
public:
    int front, rear, maxSize;
    int* queue;

    DequeOutputRestricted(int size) {
        maxSize = size;
        front = -1;
        rear = -1;
        queue = new int[maxSize];
    }

    ~DequeOutputRestricted() {
        delete[] queue;
    }

    void insert_rear(int value) {
        if ((front == 0 && rear == maxSize - 1) || (front == rear - 1)) {
            cout << "queue overflow" << endl;
            return;
        } else {
            if (front == -1 && rear == -1) {
                front = 0;
                rear = 0;
            } else if (rear == maxSize - 1 && front != 0) {
                rear = 0;
            } else {
                rear++;
            }
        }
        queue[rear] = value;
        cout << "inserted: " << value << endl;
    }

    void delete_front() {
        if ((front == -1) && (rear == -1)) {
            cout << "queue underflow" << endl;
            return;
        } else {
            cout << "removed " << queue[front] << endl;
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

    void insert_front(int value) {
        if ((front == 0 && rear == maxSize - 1) || (front == rear - 1)) {
            cout << "queue overflow" << endl;
            return;
        } else {
            if (front == -1 && rear == -1) {
                front = 0;
                rear = 0;
            } else if (front == 0) {
                front = 0;
            } else {
                front--;
            }
        }
        queue[front] = value;
        cout << "inserted: " << value << endl;
    }

    void display() {
        if (front == -1 && rear == -1) {
            cout << "queue underflow" << endl;
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
                for (int i = 0; i <= rear; i++) {
                    cout << queue[i] << "  " << endl;
                }
            }
        }
        cout << endl;
    }
};

int main() {
    int size;
    cout << "enter size of queue: " << endl;
    cin >> size;

    DequeOutputRestricted demo(size);
    int value;

    while (true) {
        cout << "enter your choice: " << endl;
        cout << "1. insert from rear" << endl;
        cout << "2. insert from front" << endl;
        cout << "3. delete from front" << endl;
        cout << "4. display" << endl;
        cout << "5. exit" << endl;
        int choice;
        cin >> choice;

        switch (choice) {
            case 1:
                cout << "---INSERT FROM REAR---" << endl;
                cout << "enter value: " << endl;
                cin >> value;
                demo.insert_rear(value);
                break;

            case 2:
                cout << "---INSERT FROM FRONT---" << endl;
                cout << "enter value: " << endl;
                cin >> value;
                demo.insert_front(value);
                break;

            case 3:
                cout << "---DELETE FROM FRONT---" << endl;
                demo.delete_front();
                break;

            case 4:
                cout << "---DISPLAY FUNCTION---" << endl;
                demo.display();
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