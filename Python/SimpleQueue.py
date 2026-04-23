class QueueArray:
    def __init__(self, size):
        self.max_size = size
        self.front = -1
        self.rear = -1
        self.arr = [None] * size

    def enqueue(self, value):
        if self.rear == self.max_size - 1:
            print("Queue Overflow.")
        else:
            if self.front == -1 and self.rear == -1:
                self.front = 0
                self.rear = 0
            else:
                self.rear += 1
            self.arr[self.rear] = value
            print(f"Value inserted: {value}")

    def dequeue(self):
        if self.front == -1 and self.rear == -1:
            print("Queue Underflow.")
        else:
            print(f"{self.arr[self.front]} deleted")
            if self.front == self.rear:
                self.front = self.rear = -1
            else:
                self.front += 1

    def display(self):
        if self.front == -1 and self.rear == -1:
            print("Queue is empty.")
        else:
            print(" ".join(str(self.arr[i]) for i in range(self.front, self.rear + 1)))

    def peek(self):
        if self.front == -1 and self.rear == -1:
            print("Queue is empty.")
        else:
            print(f"Front element: {self.arr[self.front]}")

    def is_empty(self):
        return self.front == -1 and self.rear == -1

    def is_full(self):
        return self.rear == self.max_size - 1


def main():
    size = int(input("Enter size of queue: "))
    queue = QueueArray(size)

    while True:
        print("\n1.Enqueue  2.Dequeue  3.Peek  4.Display  5.isEmpty  6.isFull  7.Exit")
        choice = int(input())

        if choice == 1:
            print("---ENQUEUE FUNCTION---")
            value = int(input("Enter value: "))
            queue.enqueue(value)
        elif choice == 2:
            print("---DEQUEUE FUNCTION---")
            queue.dequeue()
        elif choice == 3:
            print("---PEEK FUNCTION---")
            queue.peek()
        elif choice == 4:
            print("---DISPLAY FUNCTION---")
            queue.display()
        elif choice == 5:
            print("---IS EMPTY FUNCTION---")
            print(queue.is_empty())
        elif choice == 6:
            print("---IS FULL FUNCTION---")
            print(queue.is_full())
        elif choice == 7:
            print("Exiting...")
            break
        else:
            print("Invalid choice!")

if __name__ == "__main__":
    main()