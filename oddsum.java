import java.util.Scanner;

public class oddsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int tc = 0; tc < t; tc++) {
            int n = sc.nextInt();

            int odd = 0, even = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x % 2 == 0)
                    even++;
                else
                    odd++;
            }

            if (odd == 0)
                System.out.println("NO");
            else if (even > 0 || n % 2 == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
