public class Prime20 {
    public static void main(String[] args) {

        int i = 2;
        int count = 0;
        while (count < 20) {
            if (check(i)) {
                System.out.println(i);
                count++;
            }
            i++;
        }

    }

    public static boolean check(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
