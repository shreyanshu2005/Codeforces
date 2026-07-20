import java.util.Scanner;

public class worms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] prefix = new int[n];

        prefix[0] = sc.nextInt();
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + sc.nextInt();
        }
        int m = sc.nextInt();
        for(int i = 0;i<m;i++){
            int x = sc.nextInt();
            int l = 0,r = n-1;
            while (l <= r) {
                int mid = (l + r) / 2;

                if (prefix[mid] >= x) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }

            System.out.println(l + 1);
        }
    }
}
