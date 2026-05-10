import java.util.Arrays;
import java.util.Scanner;

public class RemoveSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i<t;i++){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int j = 0;j<n;j++){
                a[j] = sc.nextInt();
            }
            Arrays.sort(a);
            boolean m = true;
            for(int k = 0;k<n-1;k++){
                if (a[k + 1] - a[k] > 1) {
                    m = false;
                    break;
                }
            }
            if(m){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
