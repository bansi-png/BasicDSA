def main():
    max_size = int(input("Enter array size: "))

    print("Enter array A elements:")
    arr_a = [int(input()) for _ in range(max_size)]

    print("Enter array B elements:")
    arr_b = [int(input()) for _ in range(max_size)]

    arr_c = [arr_a[i] + arr_b[i] for i in range(max_size)]

    print("Resultant Array:")
    for val in arr_c:
        print(val)

if __name__ == "__main__":
    main()