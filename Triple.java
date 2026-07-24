import java.util.Scanner;

public class Triple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i<t;i++){
           int n = sc.nextInt();
            int[] freq = new int[n + 1];
            int ans = -1;
            for (int j = 0; j < n; j++) {
                int x = sc.nextInt();
                freq[x]++;
                if (freq[x] >= 3) {
                    ans = x;
                }
            }
            System.out.println(ans);
        } 
    }
}
