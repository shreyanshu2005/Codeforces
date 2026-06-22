import java.util.ArrayList;
import java.util.Scanner;

public class round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

       for(int i = 0;i<t;i++) {
            int n = sc.nextInt();

            ArrayList<Integer> ans = new ArrayList<>();
            int place = 1;

            while (n > 0) {
                int digit = n % 10;

                if (digit != 0) {
                    ans.add(digit * place);
                }

                n /= 10;
                place *= 10;
            }

            System.out.println(ans.size());

            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
