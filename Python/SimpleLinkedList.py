# Operations on a singly linked list:
#  1. Insert at first
#  2. Insert at last
#  3. Delete at first
#  4. Delete at last
#  5. Insert at a specific location
#  6. Delete at a specific location
#  7. Find the sum of elements
#  8. Count number of nodes
#  9. Search a given element
# 10. Reverse the linked list


class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class SimpleLinkedList:
    def __init__(self):
        self.head = None

    # 1. Insert at first
    def insert_first(self, data):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node

    # 2. Insert at last
    def insert_last(self, data):
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
            return
        temp = self.head
        while temp.next is not None:
            temp = temp.next
        temp.next = new_node

    # 3. Delete at first
    def delete_first(self):
        if self.head is None:
            print("List is empty")
            return
        self.head = self.head.next
        print("First element deleted")

    # 4. Delete at last
    def delete_last(self):
        if self.head is None:
            print("List is empty")
            return
        if self.head.next is None:
            self.head = None
            print("Last element deleted")
            return
        temp = self.head
        while temp.next.next is not None:
            temp = temp.next
        temp.next = None
        print("Last element deleted")

    # 5. Insert at a specific location (1-based)
    def insert_at_position(self, data, position):
        if position < 1:
            print("Invalid position")
            return
        if position == 1:
            self.insert_first(data)
            return
        new_node = Node(data)
        temp = self.head
        for i in range(1, position - 1):
            if temp is None:
                print("Position out of range")
                return
            temp = temp.next
        if temp is None:
            print("Position out of range")
            return
        new_node.next = temp.next
        temp.next = new_node
        print(f"Element inserted at position {position}")

    # 6. Delete at a specific location (1-based)
    def delete_at_position(self, position):
        if position < 1 or self.head is None:
            print("List is empty" if self.head is None else "Invalid position")
            return
        if position == 1:
            self.head = self.head.next
            print(f"Element at position {position} deleted")
            return
        temp = self.head
        for i in range(1, position - 1):
            if temp.next is None:
                print("Position out of range")
                return
            temp = temp.next
        if temp.next is None:
            print("Position out of range")
            return
        temp.next = temp.next.next
        print(f"Element at position {position} deleted")

    # 7. Sum of elements
    def sum(self):
        total = 0
        temp = self.head
        while temp is not None:
            total += temp.data
            temp = temp.next
        return total

    # 8. Count nodes
    def count(self):
        count = 0
        temp = self.head
        while temp is not None:
            count += 1
            temp = temp.next
        return count

    # 9. Search an element
    def search(self, key):
        temp = self.head
        position = 1
        while temp is not None:
            if temp.data == key:
                print(f"Element {key} found at position {position}")
                return True
            temp = temp.next
            position += 1
        return False

    # 10. Reverse the linked list
    def reverse(self):
        prev = None
        current = self.head
        while current is not None:
            next_node = current.next
            current.next = prev
            prev = current
            current = next_node
        self.head = prev

    # Display
    def display(self):
        if self.head is None:
            print("List is empty")
            return
        temp = self.head
        result = []
        while temp is not None:
            result.append(str(temp.data))
            temp = temp.next
        print(" -> ".join(result) + " -> null")


def main():
    linked_list = SimpleLinkedList()

    while True:
        print("\n===== Linked List Menu =====")
        print(" 1. Insert at First")
        print(" 2. Insert at Last")
        print(" 3. Delete at First")
        print(" 4. Delete at Last")
        print(" 5. Insert at Specific Position")
        print(" 6. Delete at Specific Position")
        print(" 7. Sum of Elements")
        print(" 8. Count Nodes")
        print(" 9. Search Element")
        print("10. Reverse List")
        print("11. Display List")
        print("12. Exit")
        choice = int(input("Enter choice: "))

        if choice == 1:
            val = int(input("Enter value to insert at first: "))
            linked_list.insert_first(val)
            linked_list.display()

        elif choice == 2:
            val = int(input("Enter value to insert at last: "))
            linked_list.insert_last(val)
            linked_list.display()

        elif choice == 3:
            linked_list.delete_first()
            linked_list.display()

        elif choice == 4:
            linked_list.delete_last()
            linked_list.display()

        elif choice == 5:
            val = int(input("Enter value to insert: "))
            pos = int(input("Enter position (1-based): "))
            linked_list.insert_at_position(val, pos)
            linked_list.display()

        elif choice == 6:
            pos = int(input("Enter position to delete (1-based): "))
            linked_list.delete_at_position(pos)
            linked_list.display()

        elif choice == 7:
            print(f"Sum = {linked_list.sum()}")

        elif choice == 8:
            print(f"Count = {linked_list.count()}")

        elif choice == 9:
            key = int(input("Enter value to search: "))
            if not linked_list.search(key):
                print(f"Element {key} not found")

        elif choice == 10:
            linked_list.reverse()
            print("List reversed")
            linked_list.display()

        elif choice == 11:
            linked_list.display()

        elif choice == 12:
            print("Exiting...")
            break

        else:
            print("Invalid choice")


if __name__ == "__main__":
    main()