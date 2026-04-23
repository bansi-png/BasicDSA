def linear_search(arr, target):
    for i in range(len(arr)):
        if arr[i] == target:
            return i
    return -1

def main():
    max_size = int(input("Enter your array size: "))

    print("Enter array elements:")
    arr = [int(input()) for _ in range(max_size)]

    print("  ".join(str(x) for x in arr))

    target = int(input("Enter number to search: "))
    result = linear_search(arr, target)

    if result == -1:
        print("No such element found.")
    else:
        print(f"Element at index: {result}")

if __name__ == "__main__":
    main()