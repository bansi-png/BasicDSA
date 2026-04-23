# Double ended queue - input restricted (DEQUE)
# Input only from rear; output from both front and rear

class DequeInputRestricted:
    def __init__(self, size):
        self.max_size = size
        self.front = -1
        self.rear = -1
        self.queue = [None] * size

    def insert_rear(self, value):
        if (self.rear == self.max_size - 1 and self.front == 0) or (self.front == self.rear - 1):
            print("Queue overflow")
        else:
            if self.rear == -1 and self.front == -1:
                self.rear = 0
                self.front = 0
            elif self.rear == self.max_size - 1 and self.front != 0:
                self.rear = 0
            else:
                self.rear += 1
        self.queue[self.rear] = value
        print(f"{value} inserted")

    def delete_front(self):
        if self.rear == -1 and self.front == -1:
            print("Queue underflow")
            return
        print(f"{self.queue[self.front]} removed")
        if self.front == self.rear:
            self.front = -1
            self.rear = -1
        elif self.front == self.max_size - 1 and self.front != self.rear:
            self.front = 0
        else:
            self.front += 1

    def delete_rear(self):
        if self.front == -1 and self.rear == -1:
            print("Queue underflow")
            return
        print(f"{self.queue[self.rear]} removed")
        if self.front == self.rear:
            self.front = -1
            self.rear = -1
        elif self.rear == self.max_size - 1 and self.front != self.rear:
            self.rear = 0
        else:
            self.rear -= 1

    def display(self):
        if self.front == -1 and self.rear == -1:
            print("Queue is empty")
            return
        print("Queue elements:")
        if self.front <= self.rear:
            for i in range(self.front, self.rear + 1):
                print(f"{self.queue[i]}  ")
        else:
            for i in range(self.front, self.max_size):
                print(f"{self.queue[i]}  ")
            for i in range(0, self.rear):
                print(f"{self.queue[i]}  ")


def main():
    size = int(input("Enter size of queue: "))
    dq = DequeInputRestricted(size)

    while True:
        print("\n1. Insert from rear")
        print("2. Delete from front")
        print("3. Delete from rear")
        print("4. Display")
        print("5. Exit")
        choice = int(input("Enter your choice: "))

        if choice == 1:
            print("---INSERT FROM REAR---")
            value = int(input("Enter value: "))
            dq.insert_rear(value)
        elif choice == 2:
            print("---DELETE FROM FRONT---")
            dq.delete_front()
        elif choice == 3:
            print("---DELETE FROM REAR---")
            dq.delete_rear()
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