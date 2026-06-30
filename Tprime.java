import java.util.Arrays;
import java.util.Scanner;

public class Tprime {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int LIMIT = 1000000;
        boolean[] prime = new boolean[LIMIT + 1];
        Arrays.fill(prime, true);

        prime[0] = false;
        prime[1] = false;

        for (int i = 2; i * i <= LIMIT; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= LIMIT; j += i) {
                    prime[j] = false;
                }
            }
        }

        int n = sc.nextInt();

        while (n-- > 0) {
            long x = sc.nextLong();

            long root = (long) Math.sqrt(x);

            if (root * root == x && prime[(int) root]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
     }
}
