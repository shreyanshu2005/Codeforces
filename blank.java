import java.util.*;
public class blank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 0;i<n;i++){
            int m = sc.nextInt();
            int count = 0;
            int maxcount=0;

            for(int j =0;j<m;j++){
                int p = sc.nextInt();
                
                if(p == 0){
                    count++;
                    maxcount = Math.max(maxcount,count);

                }
                else{
                    count = 0;
                }
            }
            System.out.println(maxcount);
        }
        
    }
}
