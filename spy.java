import java.util.Scanner;

public class spy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int a = sc.nextInt();
            int[] arr = new int[a];

            for(int j = 0;j<a;j++){
                
                arr[j] = sc.nextInt();

            }
            int common;
            if (arr[0] == arr[1]) {
                common = arr[0];
            } else {
                common = arr[2];
            }
            for (int k = 0; k < a; k++) {
                if (arr[k] != common) {
                    System.out.println(k+1); // 1-based index
                    break;
                }
            }
            
        }
    }
}
