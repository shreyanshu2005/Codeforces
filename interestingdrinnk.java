import java.util.Arrays;
import java.util.Scanner;

public class interestingdrinnk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }
        Arrays.sort(price);
        int q = sc.nextInt();
        while (q-- > 0) {
            int m = sc.nextInt();
            int low = 0;
            int high = n - 1;
            int ans = -1;
            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (price[mid] <= m) {
                    ans = mid;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            System.out.println(ans + 1);
        }
    }
}
