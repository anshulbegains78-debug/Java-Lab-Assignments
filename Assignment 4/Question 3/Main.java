public class Main {

    static int maxOf(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int a = 14;
        int b = 9;

        System.out.println("Larger: " + maxOf(a, b));
    }
}