#include <iostream>
using namespace std;

// Write program perform the following operations on a singly linked list.
//  Insert an element at first
//  Insert an element at last
//  Delete an element at first
//  Delete an element at last
//  Insert at a specific location
//  Delete at a specific location
//  Find the sum of elements of the list
//  Count number of the nodes in the linked list
//  Search a given elements in the linked list.
//  Reverse the linked list.

struct Node {
    int data;
    Node* next;

    Node(int data) {
        this->data = data;
        this->next = nullptr;
    }
};

class SimpleLinkedList {
public:
    Node* head = nullptr;

    // 1. Insert an element at first
    void insertFirst(int data) {
        Node* newNode = new Node(data);
        newNode->next = head;
        head = newNode;
    }

    // 2. Insert an element at last
    void insertLast(int data) {
        Node* newNode = new Node(data);

        if (head == nullptr) {
            head = newNode;
            return;
        }

        Node* temp = head;
        while (temp->next != nullptr) {
            temp = temp->next;
        }
        temp->next = newNode;
    }

    // 3. Delete an element at first
    void deleteFirst() {
        if (head == nullptr) {
            cout << "List is empty" << endl;
            return;
        }
        head = head->next;
        cout << "First element deleted" << endl;
    }

    // 4. Delete an element at last
    void deleteLast() {
        if (head == nullptr) {
            cout << "List is empty" << endl;
            return;
        }

        // Only one node
        if (head->next == nullptr) {
            head = nullptr;
            cout << "Last element deleted" << endl;
            return;
        }

        Node* temp = head;
        while (temp->next->next != nullptr) {
            temp = temp->next;
        }
        temp->next = nullptr;
        cout << "Last element deleted" << endl;
    }

    // 5. Insert at a specific location (1-based position)
    void insertAtPosition(int data, int position) {
        if (position < 1) {
            cout << "Invalid position" << endl;
            return;
        }

        if (position == 1) {
            insertFirst(data);
            return;
        }

        Node* newNode = new Node(data);
        Node* temp = head;

        for (int i = 1; i < position - 1; i++) {
            if (temp == nullptr) {
                cout << "Position out of range" << endl;
                return;
            }
            temp = temp->next;
        }

        if (temp == nullptr) {
            cout << "Position out of range" << endl;
            return;
        }

        newNode->next = temp->next;
        temp->next = newNode;
        cout << "Element inserted at position " << position << endl;
    }

    // 6. Delete at a specific location (1-based position)
    void deleteAtPosition(int position) {
        if (position < 1 || head == nullptr) {
            cout << (head == nullptr ? "List is empty" : "Invalid position") << endl;
            return;
        }

        if (position == 1) {
            head = head->next;
            cout << "Element at position " << position << " deleted" << endl;
            return;
        }

        Node* temp = head;

        for (int i = 1; i < position - 1; i++) {
            if (temp->next == nullptr) {
                cout << "Position out of range" << endl;
                return;
            }
            temp = temp->next;
        }

        if (temp->next == nullptr) {
            cout << "Position out of range" << endl;
            return;
        }

        temp->next = temp->next->next;
        cout << "Element at position " << position << " deleted" << endl;
    }

    // 7. Find the sum of elements of the list
    int sum() {
        int sum = 0;
        Node* temp = head;

        while (temp != nullptr) {
            sum += temp->data;
            temp = temp->next;
        }

        return sum;
    }

    // 8. Count number of nodes in the linked list
    int count() {
        int count = 0;
        Node* temp = head;

        while (temp != nullptr) {
            count++;
            temp = temp->next;
        }

        return count;
    }

    // 9. Search a given element in the linked list
    bool search(int key) {
        Node* temp = head;
        int position = 1;

        while (temp != nullptr) {
            if (temp->data == key) {
                cout << "Element " << key << " found at position " << position << endl;
                return true;
            }
            temp = temp->next;
            position++;
        }

        return false;
    }

    // 10. Reverse the linked list
    void reverse() {
        Node* prev = nullptr;
        Node* current = head;
        Node* next = nullptr;

        while (current != nullptr) {
            next = current->next;   // store next
            current->next = prev;   // reverse link
            prev = current;         // move prev
            current = next;         // move current
        }

        head = prev;
    }

    // Display
    void display() {
        Node* temp = head;

        if (temp == nullptr) {
            cout << "List is empty" << endl;
            return;
        }

        while (temp != nullptr) {
            cout << temp->data << " -> ";
            temp = temp->next;
        }
        cout << "null" << endl;
    }
};

int main() {
    SimpleLinkedList list;
    int choice;

    do {
        cout << "\n===== Linked List Menu =====" << endl;
        cout << " 1. Insert at First" << endl;
        cout << " 2. Insert at Last" << endl;
        cout << " 3. Delete at First" << endl;
        cout << " 4. Delete at Last" << endl;
        cout << " 5. Insert at Specific Position" << endl;
        cout << " 6. Delete at Specific Position" << endl;
        cout << " 7. Sum of Elements" << endl;
        cout << " 8. Count Nodes" << endl;
        cout << " 9. Search Element" << endl;
        cout << "10. Reverse List" << endl;
        cout << "11. Display List" << endl;
        cout << "12. Exit" << endl;
        cout << "Enter choice: ";
        cin >> choice;

        switch (choice) {
            case 1: {
                int val;
                cout << "Enter value to insert at first: ";
                cin >> val;
                list.insertFirst(val);
                list.display();
                break;
            }
            case 2: {
                int val;
                cout << "Enter value to insert at last: ";
                cin >> val;
                list.insertLast(val);
                list.display();
                break;
            }
            case 3:
                list.deleteFirst();
                list.display();
                break;

            case 4:
                list.deleteLast();
                list.display();
                break;

            case 5: {
                int val, pos;
                cout << "Enter value to insert: ";
                cin >> val;
                cout << "Enter position (1-based): ";
                cin >> pos;
                list.insertAtPosition(val, pos);
                list.display();
                break;
            }
            case 6: {
                int pos;
                cout << "Enter position to delete (1-based): ";
                cin >> pos;
                list.deleteAtPosition(pos);
                list.display();
                break;
            }
            case 7:
                cout << "Sum = " << list.sum() << endl;
                break;

            case 8:
                cout << "Count = " << list.count() << endl;
                break;

            case 9: {
                int key;
                cout << "Enter value to search: ";
                cin >> key;
                if (!list.search(key))
                    cout << "Element " << key << " not found" << endl;
                break;
            }
            case 10:
                list.reverse();
                cout << "List reversed" << endl;
                list.display();
                break;

            case 11:
                list.display();
                break;

            case 12:
                cout << "Exiting..." << endl;
                break;

            default:
                cout << "Invalid choice" << endl;
        }

    } while (choice != 12);

    return 0;
}