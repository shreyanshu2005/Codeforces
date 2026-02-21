import java.util.*;
public class Ab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 0;i<n;i++){
            String expr = sc.next();   // read "4+2"

            String[] parts = expr.split("\\+");

            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);
            System.out.println(a+b);
        }
        
    }
}
