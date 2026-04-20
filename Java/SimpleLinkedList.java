// Write program perform the following operations on a singly linked list.
//  Insert an element at first
//  Insert an element at last
//  Delete an element at first
//  Delete an element at last
//  Insert at a specific location
//  Delete at a specific location
//  Find the sum of elements of the list
//  Count number of the nodes in the linked list
//  Search a given elements in the linked list.
//  Reverse the linked list.

import java.util.Scanner;

class SimpleLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    // 1. Insert an element at first
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // 2. Insert an element at last
    public void insertLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // 3. Delete an element at first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        System.out.println("First element deleted");
    }

    // 4. Delete an element at last
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Only one node
        if (head.next == null) {
            head = null;
            System.out.println("Last element deleted");
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        System.out.println("Last element deleted");
    }

    // 5. Insert at a specific location (1-based position)
    public void insertAtPosition(int data, int position) {
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            insertFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 1; i < position - 1; i++) {
            if (temp == null) {
                System.out.println("Position out of range");
                return;
            }
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println("Element inserted at position " + position);
    }

    // 6. Delete at a specific location (1-based position)
    public void deleteAtPosition(int position) {
        if (position < 1 || head == null) {
            System.out.println(head == null ? "List is empty" : "Invalid position");
            return;
        }

        if (position == 1) {
            head = head.next;
            System.out.println("Element at position " + position + " deleted");
            return;
        }

        Node temp = head;

        for (int i = 1; i < position - 1; i++) {
            if (temp.next == null) {
                System.out.println("Position out of range");
                return;
            }
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Position out of range");
            return;
        }

        temp.next = temp.next.next;
        System.out.println("Element at position " + position + " deleted");
    }

    // 7. Find the sum of elements of the list
    public int sum() {
        int sum = 0;
        Node temp = head;

        while (temp != null) {
            sum += temp.data;
            temp = temp.next;
        }

        return sum;
    }

    // 8. Count number of nodes in the linked list
    public int count() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    // 9. Search a given element in the linked list
    public boolean search(int key) {
        Node temp = head;
        int position = 1;

        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Element " + key + " found at position " + position);
                return true;
            }
            temp = temp.next;
            position++;
        }

        return false;
    }

    // 10. Reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;   // store next
            current.next = prev;   // reverse link
            prev = current;        // move prev
            current = next;        // move current
        }

        head = prev;
    }

    // Display
    public void display() {
        Node temp = head;

        if (temp == null) {
            System.out.println("List is empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleLinkedList list = new SimpleLinkedList();

        int choice;

        do {
            System.out.println("\n===== Linked List Menu =====");
            System.out.println(" 1. Insert at First");
            System.out.println(" 2. Insert at Last");
            System.out.println(" 3. Delete at First");
            System.out.println(" 4. Delete at Last");
            System.out.println(" 5. Insert at Specific Position");
            System.out.println(" 6. Delete at Specific Position");
            System.out.println(" 7. Sum of Elements");
            System.out.println(" 8. Count Nodes");
            System.out.println(" 9. Search Element");
            System.out.println("10. Reverse List");
            System.out.println("11. Display List");
            System.out.println("12. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at first: ");
                    list.insertFirst(sc.nextInt());
                    list.display();
                    break;

                case 2:
                    System.out.print("Enter value to insert at last: ");
                    list.insertLast(sc.nextInt());
                    list.display();
                    break;

                case 3:
                    list.deleteFirst();
                    list.display();
                    break;

                case 4:
                    list.deleteLast();
                    list.display();
                    break;

                case 5:
                    System.out.print("Enter value to insert: ");
                    int val = sc.nextInt();
                    System.out.print("Enter position (1-based): ");
                    int pos = sc.nextInt();
                    list.insertAtPosition(val, pos);
                    list.display();
                    break;

                case 6:
                    System.out.print("Enter position to delete (1-based): ");
                    list.deleteAtPosition(sc.nextInt());
                    list.display();
                    break;

                case 7:
                    System.out.println("Sum = " + list.sum());
                    break;

                case 8:
                    System.out.println("Count = " + list.count());
                    break;

                case 9:
                    System.out.print("Enter value to search: ");
                    int key = sc.nextInt();
                    if (!list.search(key))
                        System.out.println("Element " + key + " not found");
                    break;

                case 10:
                    list.reverse();
                    System.out.println("List reversed");
                    list.display();
                    break;

                case 11:
                    list.display();
                    break;

                case 12:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 12);

        sc.close();
    }
}