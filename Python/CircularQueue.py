class CircularQueue:
    def __init__(self, size):
        self.max_size = size
        self.front = -1
        self.rear = -1
        self.queue = [None] * size

    def enqueue(self, value):
        if ((self.rear == self.max_size - 1) and (self.front == 0)) or (self.front == self.rear - 1):
            print("Queue overflow")
        else:
            if self.front == -1 and self.rear == -1:
                self.front = 0
                self.rear = 0
            elif self.front != 0 and self.rear == self.max_size - 1:
                self.rear = 0
            else:
                self.rear += 1
            self.queue[self.rear] = value
            print(f"Inserted: {value}")

    def dequeue(self):
        if self.front == -1 and self.rear == -1:
            print("Queue underflow")
        else:
            if self.front == self.rear:
                self.front = -1
                self.rear = -1
            elif self.front == self.max_size - 1 and self.front != self.rear:
                self.front = 0
            else:
                self.front += 1

    def display(self):
        if self.front == -1 and self.rear == -1:
            print("Queue is empty")
            return
        if self.front <= self.rear:
            print(" ".join(str(self.queue[i]) for i in range(self.front, self.rear + 1)))
        else:
            part1 = [str(self.queue[i]) for i in range(self.front, self.max_size)]
            part2 = [str(self.queue[i]) for i in range(0, self.rear + 1)]
            print(" ".join(part1 + part2))

    def is_empty(self):
        return self.front == -1 and self.rear == -1

    def is_full(self):
        return ((self.rear == self.max_size - 1) and (self.front == 0)) or (self.front == self.rear - 1)


def main():
    size = int(input("Enter size of circular queue: "))
    cq = CircularQueue(size)

    while True:
        print("\n1.Enqueue  2.Dequeue  3.Display  4.isEmpty  5.isFull  6.Exit")
        choice = int(input("Enter a choice: "))

        if choice == 1:
            print("---ENQUEUE FUNCTION---")
            val = int(input("Enter value to enqueue: "))
            cq.enqueue(val)
        elif choice == 2:
            print("---DEQUEUE FUNCTION---")
            cq.dequeue()
        elif choice == 3:
            print("---DISPLAY FUNCTION---")
            cq.display()
        elif choice == 4:
            print("---IS EMPTY FUNCTION---")
            print(cq.is_empty())
        elif choice == 5:
            print("---IS FULL FUNCTION---")
            print(cq.is_full())
        elif choice == 6:
            print("Exiting...")
            break
        else:
            print("Invalid choice!")

if __name__ == "__main__":
    main()