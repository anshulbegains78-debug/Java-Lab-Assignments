public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 3, 4};

        int smallest = arr[0];
        int index = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                index = i;
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Index: " + index);
    }
}