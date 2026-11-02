public class Main {

    static int fact(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;
    }

    static int nCr(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;

        System.out.println(n + "C" + r + " = " + nCr(n, r));
    }
}