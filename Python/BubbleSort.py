def bubble_sort(arr):
    n = len(arr)
    for i in range(n - 1):
        swapped = False
        for j in range(n - 1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
                swapped = True
        if not swapped:
            break

def print_array(arr):
    print("  ".join(str(x) for x in arr))

def main():
    n = int(input("Enter array size: "))

    print("Enter array elements:")
    arr = [int(input()) for _ in range(n)]

    print("Original array:")
    print_array(arr)

    bubble_sort(arr)

    print("Sorted array:")
    print_array(arr)

if __name__ == "__main__":
    main()