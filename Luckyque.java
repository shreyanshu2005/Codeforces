
import java.util.Scanner;

public class Luckyque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            String a = sc.next();
            int first = (a.charAt(0) - '0')+(a.charAt(1) - '0')+(a.charAt(2)-'0');
            int last = (a.charAt(3)- '0') + (a.charAt(4) - '0') + (a.charAt(5) - '0');
            if(first == last){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
