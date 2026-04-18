#include <iostream>
using namespace std;

class QueueArray {
public:
    int front, rear, maxSize;
    int* arr;

    QueueArray(int size) {
        maxSize = size;
        front = -1;
        rear = -1;
        arr = new int[maxSize];
    }

    ~QueueArray() {
        delete[] arr;
    }

    void enqueue(int value) {
        if (rear == maxSize - 1) {
            cout << "Queue Overflow." << endl;
        } else {
            if (front == -1 && rear == -1) {
                front = 0;
                rear = 0;
            } else {
                rear++;
            }
            arr[rear] = value;
            cout << "Value inserted: " << value << endl;
        }
    }

    void dequeue() {
        if (front == -1 && rear == -1) {
            cout << "Queue Underflow." << endl;
        } else {
            cout << arr[front] << " deleted" << endl;
            if (front == rear) {
                front = rear = -1;
            } else {
                front++;
            }
        }
    }

    void display() {
        if (front == -1 && rear == -1) {
            cout << "Queue is empty." << endl;
        } else {
            for (int i = front; i <= rear; i++) {
                cout << arr[i] << " ";
            }
            cout << endl;
        }
    }

    void peek() {
        if (front == -1 && rear == -1) {
            cout << "Queue is empty." << endl;
        } else {
            cout << "Front element: " << arr[front] << endl;
        }
    }

    bool isEmpty() {
        if (front == -1 && rear == -1) return true;
        else return false;
    }

    bool isFull() {
        if (rear == maxSize - 1) return true;
        else return false;
    }
};

int main() {
    int size;
    cout << "Enter size of queue: ";
    cin >> size;

    QueueArray var(size);

    while (true) {
        cout << "\n1.Enqueue; 2.Dequeue; 3.Peek; 4.Display; 5.isEmpty; 6.isFull; 7.Exit" << endl;
        int choice;
        cin >> choice;

        switch (choice) {
            case 1:
                cout << "---ENQUEUE FUNCTION---" << endl;
                cout << "Enter value: ";
                int val;
                cin >> val;
                var.enqueue(val);
                break;

            case 2:
                cout << "---DEQUEUE FUNCTION---" << endl;
                var.dequeue();
                break;

            case 3:
                cout << "---PEEK FUNCTION---" << endl;
                var.peek();
                break;

            case 4:
                cout << "---DISPLAY FUNCTION---" << endl;
                var.display();
                break;

            case 5:
                cout << "---IS EMPTY FUNCTION---" << endl;
                cout << (var.isEmpty() ? "true" : "false") << endl;
                break;

            case 6:
                cout << "---IS FULL FUNCTION---" << endl;
                cout << (var.isFull() ? "true" : "false") << endl;
                break;

            case 7:
                cout << "Exiting..." << endl;
                return 0;

            default:
                cout << "Invalid choice!" << endl;
        }
    }

    return 0;
}