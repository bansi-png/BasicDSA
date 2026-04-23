def partition(arr, low, high):
    pivot = arr[high]
    i = low - 1

    for j in range(low, high):
        if arr[j] <= pivot:
            i += 1
            arr[i], arr[j] = arr[j], arr[i]

    arr[i + 1], arr[high] = arr[high], arr[i + 1]
    return i + 1

def quick_sort(arr, l, h):
    if l < h:
        pi = partition(arr, l, h)
        quick_sort(arr, l, pi - 1)
        quick_sort(arr, pi + 1, h)

def main():
    arr = [10, 7, 8, 9, 1, 5]
    quick_sort(arr, 0, len(arr) - 1)
    print(" ".join(str(x) for x in arr))

if __name__ == "__main__":
    main()