# Checks if a matrix is a lower triangular matrix

def main():
    n = int(input("Enter the size of the matrix: "))

    arr = []
    print("Enter elements of the matrix:")
    for i in range(n):
        print(f"Enter Row {i + 1}:")
        row = [int(input()) for _ in range(n)]
        arr.append(row)

    print("The Matrix is:")
    for row in arr:
        print("\t".join(str(x) for x in row))

    is_triangular = True
    for i in range(n):
        for j in range(n):
            if (i < j and arr[i][j] != 0) or (i >= j and arr[i][j] == 0):
                is_triangular = False
                break
        if not is_triangular:
            break

    if is_triangular:
        print("The Matrix is Lower Triangular")
    else:
        print("The Matrix is not Lower Triangular")

if __name__ == "__main__":
    main()