# MatrixDemo.py

def main():
    rows = int(input("Enter number of rows: "))
    cols = int(input("Enter number of columns: "))

    print("Enter matrix elements:")
    matrix = []
    for i in range(rows):
        row = [int(input()) for _ in range(cols)]
        matrix.append(row)

    print("Your entered matrix:")
    for row in matrix:
        print(" ".join(str(x) for x in row))

if __name__ == "__main__":
    main()