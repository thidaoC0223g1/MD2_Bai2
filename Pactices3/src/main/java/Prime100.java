public class Prime100 {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            if (check(i)) {
                System.out.println(i);

            }
        }
    }


    public static boolean check(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
