def main():
    rows = int(input("Enter size of rows: "))
    cols = int(input("Enter size of columns: "))

    print("Enter matrix elements:")
    matrix = [[int(input()) for _ in range(cols)] for _ in range(rows)]

    for row in matrix:
        print("  ".join(str(x) for x in row))

if __name__ == "__main__":
    main()