def main():
    max_size = int(input("Enter size of array: "))
    arr = []

    print("Enter array elements:")
    for _ in range(max_size):
        arr.append(int(input()))

    print("Your entered array:")
    print("  ".join(str(x) for x in arr))

if __name__ == "__main__":
    main()