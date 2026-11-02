public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int j = 0; j < 3; j++) {
            int sum = 0;

            for (int i = 0; i < 3; i++) {
                sum = sum + matrix[i][j];
            }

            System.out.println("Column " + (j + 1) + " Sum: " + sum);
        }
    }
}