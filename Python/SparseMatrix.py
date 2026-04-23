# Determines if a given matrix is a sparse matrix

def main():
    a = [
        [1, 7, 0],
        [0, 0, 0],
        [0, 0, 6]
    ]

    rows = len(a)
    cols = len(a[0])
    size = rows * cols

    count = sum(1 for i in range(rows) for j in range(cols) if a[i][j] == 0)

    if count > size // 2:
        print("Given matrix is a sparse matrix")
    else:
        print("Given matrix is not a sparse matrix")

if __name__ == "__main__":
    main()