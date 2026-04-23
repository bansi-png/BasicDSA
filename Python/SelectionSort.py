def selection_sort(arr):
    n = len(arr)
    for i in range(n - 1):
        min_index = i
        for j in range(i + 1, n):
            if arr[j] < arr[min_index]:
                min_index = j
        arr[i], arr[min_index] = arr[min_index], arr[i]

def print_array(arr):
    print("  ".join(str(x) for x in arr))

def main():
    max_size = int(input("Enter size of array: "))

    print("Enter array elements:")
    arr = [int(input()) for _ in range(max_size)]

    print("Original array:")
    print_array(arr)

    selection_sort(arr)

    print("Sorted array:")
    print_array(arr)

if __name__ == "__main__":
    main()