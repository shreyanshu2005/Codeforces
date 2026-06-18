import java.util.Arrays;
import java.util.Scanner;

public class Dragon {
    public static void main(String[] args) {
        
 Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int n = sc.nextInt();

        int[][] dragons = new int[n][2];

        for (int i = 0; i < n; i++) {
            dragons[i][0] = sc.nextInt(); // dragon's strength
            dragons[i][1] = sc.nextInt(); // bonus strength
        }

        // Sort dragons by their strength
        Arrays.sort(dragons, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < n; i++) {
            if (s > dragons[i][0]) {
                s += dragons[i][1];
            } else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");


    }
}
