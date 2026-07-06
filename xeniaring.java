import java.util.Scanner;

public class xeniaring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long time = 0;
        int curr = 1;
        for (int i = 0; i < m; i++) {
            int next = sc.nextInt();
            if (next >= curr) {
                time += next - curr;
            } else {
                time += (n - curr) + next;
            }
            curr = next;
        }
        System.out.println(time);
    }
}
