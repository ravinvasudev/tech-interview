package io.techinterview.codingproblems;

public class CalculateArrayMemoryLocation {

    public static void main(String[] args) {
        calArrayMemoryLocation();
    }

    private static void calArrayMemoryLocation() {
        int baseAddress = 101;
        int rows = 3;
        int colPerRow = 3;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < colPerRow; col++) {
                int locAddr = baseAddress + (((row * colPerRow) + col) * 4);
                System.out.println(String.format("%d %d %d", row, col, locAddr));
            }
        }
        System.out.println("-------------------");
    }
}
