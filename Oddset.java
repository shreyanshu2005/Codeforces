import java.util.*;

public class Oddset {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int tc = 0; tc < t; tc++) {

            int n = sc.nextInt();
            int even = 0, odd = 0;

            for (int i = 0; i < 2 * n; i++) {
                int a = sc.nextInt();

                if (a % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            if (even == odd) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}