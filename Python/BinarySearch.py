# Works only on sorted lists/arrays

def binary_search(arr, target):
    left, right = 0, len(arr) - 1

    while left <= right:
        mid = left + (right - left) // 2

        if arr[mid] == target:
            return target
        elif arr[mid] < target:
            left = mid + 1
        else:
            right = mid - 1

    return -1

def main():
    arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]

    target = int(input("Enter element to search from 1 to 9: "))
    result = binary_search(arr, target)

    if result != -1:
        print(f"Element found at index: {result}")
    else:
        print("Element not found.")

if __name__ == "__main__":
    main()