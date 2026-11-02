public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("First Row:");
        for (int j = 0; j < 3; j++) {
            System.out.print(matrix[0][j] + " ");
        }

        System.out.println();

        System.out.println("Last Row:");
        for (int j = 0; j < 3; j++) {
            System.out.print(matrix[2][j] + " ");
        }
    }
}