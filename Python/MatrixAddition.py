def main():
    rows = int(input("Enter number of rows: "))
    cols = int(input("Enter number of columns: "))

    print("Enter elements of Matrix A:")
    a = [[int(input()) for _ in range(cols)] for _ in range(rows)]

    print("Enter elements of Matrix B:")
    b = [[int(input()) for _ in range(cols)] for _ in range(rows)]

    c = [[a[i][j] + b[i][j] for j in range(cols)] for i in range(rows)]

    print("Resultant Matrix:")
    for row in c:
        print(" ".join(str(x) for x in row))

if __name__ == "__main__":
    main()