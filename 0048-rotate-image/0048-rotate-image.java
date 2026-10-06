class Solution {
    public void rotate(int[][] matrix) {
          int n = matrix.length;

        // Transpose the matrix by swapping across the main diagonal.
        for (int row = 0; row < n; row++) {
            for (int col = row + 1; col < n; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

        // Reverse every row to complete the clockwise rotation.
        for (int row = 0; row < n; row++) {
            reverseRow(matrix[row]);
        }
    }

    // Reverses one row in place.
    private void reverseRow(int[] row) {
        int left = 0;
        int right = row.length - 1;

        // Move both ends inward until the full row is reversed.
        while (left < right) {
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }
}