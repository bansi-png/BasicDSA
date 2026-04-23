class StackArray:
    def __init__(self, size):
        self.max_size = size
        self.arr = [None] * size
        self.top = -1

    def push(self, value):
        if self.top == self.max_size - 1:
            print("Stack Overflow.")
        else:
            self.top += 1
            self.arr[self.top] = value
            print(f"Value pushed: {value}")

    def pop(self):
        if self.top == -1:
            print("Stack Underflow.")
        else:
            value = self.arr[self.top]
            self.top -= 1
            print(f"Value popped: {value}")

    def display(self):
        if self.top == -1:
            print("Stack Underflow.")
        else:
            print(" ".join(str(self.arr[i]) for i in range(self.top + 1)))

    def peek(self):
        if self.top == -1:
            print("Stack Underflow.")
        else:
            print(f"Top element: {self.arr[self.top]}")

    def is_full(self):
        return self.top == self.max_size - 1

    def is_empty(self):
        return self.top == -1


def main():
    max_size = int(input("Enter size of stack: "))
    stack = StackArray(max_size)

    while True:
        print("\n1. Push  2. Pop  3. Peek  4. Display  5. isFull  6. isEmpty  7. Exit")
        choice = int(input("Enter your choice: "))

        if choice == 1:
            print("---PUSH FUNCTION---")
            value = int(input("Enter value to push: "))
            stack.push(value)
        elif choice == 2:
            print("---POP FUNCTION---")
            stack.pop()
        elif choice == 3:
            print("---PEEK FUNCTION---")
            stack.peek()
        elif choice == 4:
            print("---DISPLAY FUNCTION---")
            stack.display()
        elif choice == 5:
            print("---IS FULL FUNCTION---")
            print(stack.is_full())
        elif choice == 6:
            print("---IS EMPTY FUNCTION---")
            print(stack.is_empty())
        elif choice == 7:
            print("Exiting...")
            break
        else:
            print("Invalid choice!")

if __name__ == "__main__":
    main()