import java.util.*;

public class Frodo {
    static long pillowsOnSide(long x, long len) {
        if (x > len) {
            return (len * (2 * x - len - 1)) / 2;
        } else {
            return ((x - 1) * x) / 2 + (len - (x - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();
        long k = sc.nextLong();

        long left = k - 1;
        long right = n - k;

        long low = 1;
        long high = m;
        long ans = 1;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            long total = mid;
            total += pillowsOnSide(mid, left);
            total += pillowsOnSide(mid, right);

            if (total <= m) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(ans);
    }
}