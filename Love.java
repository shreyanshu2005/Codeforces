import java.util.*;
public class Love {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String target = "codeforces";
        for(int i = 0;i<n;i++){
            String s = sc.next();
            int count = 0;
            for(int j = 0;j<10;j++){
                if(s.charAt(j)!= target.charAt(j)){
                    count++;
                }
            }
            System.out.println(count);
        }
        
    }
}
