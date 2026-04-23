# Double ended queue - output restricted
# Insert from rear and front; delete only from front

class DequeOutputRestricted:
    def __init__(self, size):
        self.max_size = size
        self.front = -1
        self.rear = -1
        self.queue = [None] * size

    def insert_rear(self, value):
        if (self.front == 0 and self.rear == self.max_size - 1) or (self.front == self.rear - 1):
            print("Queue overflow")
            return
        if self.front == -1 and self.rear == -1:
            self.front = 0
            self.rear = 0
        elif self.rear == self.max_size - 1 and self.front != 0:
            self.rear = 0
        else:
            self.rear += 1
        self.queue[self.rear] = value
        print(f"Inserted: {value}")

    def insert_front(self, value):
        if (self.front == 0 and self.rear == self.max_size - 1) or (self.front == self.rear - 1):
            print("Queue overflow")
            return
        if self.front == -1 and self.rear == -1:
            self.front = 0
            self.rear = 0
        elif self.front == 0:
            self.front = 0  # wrapping not done (same as Java original)
        else:
            self.front -= 1
        self.queue[self.front] = value
        print(f"Inserted: {value}")

    def delete_front(self):
        if self.front == -1 and self.rear == -1:
            print("Queue underflow")
            return
        print(f"Removed {self.queue[self.front]}")
        if self.front == self.rear:
            self.front = -1
            self.rear = -1
        elif self.front == self.max_size - 1 and self.front != self.rear:
            self.front = 0
        else:
            self.front += 1

    def display(self):
        if self.front == -1 and self.rear == -1:
            print("Queue underflow")
            return
        print("Queue elements:")
        if self.front <= self.rear:
            for i in range(self.front, self.rear + 1):
                print(f"{self.queue[i]}  ")
        else:
            for i in range(self.front, self.max_size):
                print(f"{self.queue[i]}  ")
            for i in range(0, self.rear + 1):
                print(f"{self.queue[i]}  ")
        print()


def main():
    size = int(input("Enter size of queue: "))
    dq = DequeOutputRestricted(size)

    while True:
        print("\n1. Insert from rear")
        print("2. Insert from front")
        print("3. Delete from front")
        print("4. Display")
        print("5. Exit")
        choice = int(input("Enter your choice: "))

        if choice == 1:
            print("---INSERT FROM REAR---")
            value = int(input("Enter value: "))
            dq.insert_rear(value)
        elif choice == 2:
            print("---INSERT FROM FRONT---")
            value = int(input("Enter value: "))
            dq.insert_front(value)
        elif choice == 3:
            print("---DELETE FROM FRONT---")
            dq.delete_front()
        elif choice == 4:
            print("---DISPLAY FUNCTION---")
            dq.display()
        elif choice == 5:
            print("Exiting...")
            break
        else:
            print("Invalid choice")

if __name__ == "__main__":
    main()