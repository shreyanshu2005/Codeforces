import java.util.*;

public class translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        boolean isReverse = true;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(s1.length() - 1 - i)) {
                isReverse = false;
                break;
            }
        }

        if (isReverse) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
