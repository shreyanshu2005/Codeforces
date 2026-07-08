import java.util.Scanner;

public class Linetrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int prev = 0;
            int maxGap = 0;
            int last = 0;
            for (int j = 0; j < n; j++) {
                last = sc.nextInt();
                maxGap = Math.max(maxGap, last - prev);
                prev = last;
            }
            maxGap = Math.max(maxGap, 2 * (x - last));
            System.out.println(maxGap);
        }
    }
}
