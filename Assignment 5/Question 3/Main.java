public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 12, 2, 14, 7};

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10) {
                count++;
            }
        }

        System.out.println("Count: " + count);
    }
}