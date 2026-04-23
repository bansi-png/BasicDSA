# Converts a matrix to an upper triangular matrix

def print_matrix(arr):
    for row in arr:
        print(" ".join(str(x) for x in row))

def upper_triangular_matrix(arr):
    m = len(arr)
    n = len(arr[0])

    if m != n:
        print("Matrix entered should be a Square Matrix")
        print("Try Again...")
        return

    for i in range(m):
        for j in range(n):
            if i > j:
                arr[i][j] = 0

    print("Upper Triangular Matrix is:")
    print_matrix(arr)

def main():
    m = int(input("Enter the number of rows: "))
    n = int(input("Enter the number of columns: "))

    print("Enter the matrix elements:")
    arr = [[int(input()) for _ in range(n)] for _ in range(m)]

    print("Original Matrix is:")
    print_matrix(arr)

    upper_triangular_matrix(arr)

if __name__ == "__main__":
    main()