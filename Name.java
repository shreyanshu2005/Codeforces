import java.util.*;
public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int b = sc.nextInt();
            String s = sc.next();
            String t = sc.next();
            char[] a = s.toCharArray();
            char[] c = t.toCharArray();
            Arrays.sort(a);
            Arrays.sort(c);
            if(Arrays.equals(a,c)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}
