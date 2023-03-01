package com.company.Homework10;

public class Matrix {
    public void main(String[] args) {
        Matrix m = new Matrix(2, 2, -1);
        m.set(0, 1, 15);
        int v1 = m.get(0, 1); //15
        int v2 = m.get(0, 0); // -1

        System.out.println(v1);
        System.out.println(v2);


        Matrix m1 = new Matrix(4, 4);
        for (int i = 0; i < 4; i++) {
            m1.set(i, i, i + 1);
        }
        System.out.println(m1);
        // 1 0 0 0
        // 0 2 0 0
        // 0 0 3 0
        // 0 0 0 4

        Range columns = new Range(1, 2);
        Range rows = new Range(2, 3);
        Matrix m2 = m1.subMatrix(columns, rows);
        System.out.println(m2);
    }

    private int[][] matrix;
    private int rows;
    private int cols;

    public Matrix(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        this.matrix = new int[cols][rows];
    }

    public Matrix(int cols, int rows, int defaultValue) {
        this(cols, rows);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[j][i] = defaultValue;
            }
        }
    }

    public void set(int x, int y, int value) {
        matrix[x][y] = value;
    }

    public int get(int x, int y) {
        return matrix[x][y];
    }

    public Matrix subMatrix(Range columns, Range rows) {
        int numRows = rows.getEnd() - rows.getStart() + 1;
        int numCols = columns.getEnd() - columns.getStart() + 1;
        Matrix subMatrix = new Matrix(numCols, numRows);

        for (int i = rows.getStart(); i <= rows.getEnd(); i++) {
            for (int j = columns.getStart(); j <= columns.getEnd(); j++) {
                subMatrix.set(j - columns.getStart(), i - rows.getStart(), get(j, i));
            }
        }

        return subMatrix;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sb.append(matrix[j][i]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public class Range {
        private int start;
        private int end;

        public Range(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }
    }
}
