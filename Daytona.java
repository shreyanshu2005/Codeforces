import java.util.*;
public class Daytona {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        
        for(int i = 0;i<n;i++){
            int m = sc.nextInt();
            int k = sc.nextInt();
            int count = 0;
            for(int j = 0;j<m;j++){
                int num = sc.nextInt();
                if(num == k){
                    count++;
                }
            }
            if(count>=1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
