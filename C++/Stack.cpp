#include <iostream>
using namespace std;

class stackArray {
public:
    int top, maxSize;
    int* arr;

    stackArray(int size) {
        maxSize = size;
        arr = new int[maxSize];
        top = -1;
    }

    ~stackArray() {
        delete[] arr;
    }

    void push(int value) {
        if (top == maxSize - 1) {
            cout << "Stack Overflow." << endl;
        } else {
            top++;
            arr[top] = value;
            cout << "value pushed: " << value << endl;
        }
    }

    void pop() {
        if (top == -1) {
            cout << "Stack Underflow." << endl;
        } else {
            int value = arr[top];
            top--;
            cout << "value popped: " << value << endl;
        }
    }

    void displayStack() {
        if (top == -1) {
            cout << "Stack Underflow." << endl;
        } else {
            for (int i = 0; i <= top; i++) {
                cout << arr[i] << " ";
            }
        }
    }

    void peek() {
        if (top == -1) {
            cout << "Stack Underflow." << endl;
        } else {
            cout << "Top element: " << arr[top] << endl;
        }
    }

    bool isFull() {
        if (top == maxSize - 1) return true;
        else return false;
    }

    bool isEmpty() {
        if (top == -1) return true;
        else return false;
    }
};

int main() {
    int maxSize;

    cout << "Enter size of stack: " << endl;
    cin >> maxSize;

    stackArray var(maxSize);

    while (true) {
        cout << "enter your choice: " << endl;
        cout << "1. push; 2. pop; 3. peek; 4. display; 5. isFull; 6. isEmpty; 7. exit" << endl;
        int choice;
        cin >> choice;

        switch (choice) {
            case 1:
                cout << "---PUSH FUNCTION---" << endl;
                cout << "enter value to push in stack: " << endl;
                int value;
                cin >> value;
                var.push(value);
                break;

            case 2:
                cout << "---POP FUNCTION---" << endl;
                var.pop();
                break;

            case 3:
                cout << "---PEEK FUNCTION---" << endl;
                var.peek();
                break;

            case 4:
                cout << "---DISPLAY FUNCTION---" << endl;
                var.displayStack();
                break;

            case 5:
                cout << "---IS FULL FUNCTION---" << endl;
                cout << (var.isFull() ? "true" : "false") << endl;
                break;

            case 6:
                cout << "---IS EMPTY FUNCTION---" << endl;
                cout << (var.isEmpty() ? "true" : "false") << endl;
                break;

            case 7:
                cout << "Exiting..." << endl;
                return 0;

            default:
                cout << "invalid choice!" << endl;
        }
    }

    return 0;
}