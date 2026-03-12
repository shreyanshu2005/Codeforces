import java.util.*;
public class abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            String s = sc.next();
            if (s.equals("abc") || s.equals("acb") || s.equals("bac") || s.equals("cba")) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
