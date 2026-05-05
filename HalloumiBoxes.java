import java.util.Scanner;

public class HalloumiBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        for(int i = 0;i<l;i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            boolean issorted = true;
            for(int j = 0;j<n;j++){
                a[j] = sc.nextInt(); 
                if( j > 0 && a[j-1]>a[j]){
                    issorted = false;
                }
            }
            if(k>=2 || issorted){
                System.out.println("YES");
                
            }
            else{
                System.out.println("NO");
                
            }
        }
    }
}
