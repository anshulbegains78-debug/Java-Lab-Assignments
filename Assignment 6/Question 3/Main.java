public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 9, 7};

        System.out.println("Repeated elements:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}