import java.util.Arrays;
import java.util.Scanner;

public class goodkid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 0;i<n;i++){
            int b = sc.nextInt();
            int[] arr = new int[b];

            for (int j = 0; j < b; j++) {
                arr[j] = sc.nextInt();
            }

            Arrays.sort(arr);
            arr[0]++;

            long ans = 1;

            for (int k = 0; k < b; k++) {
                ans *= arr[k];
            }
        System.out.println(ans);
        }
    }
}
