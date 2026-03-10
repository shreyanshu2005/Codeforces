import java.util.*;
public class Trippi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            String a = sc.next();
            String b = sc.next();
            String c = sc.next();
            System.out.println(""+a.charAt(0) + b.charAt(0) + c.charAt(0));
        }
     }
}
