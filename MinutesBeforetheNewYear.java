import java.util.*;
public class MinutesBeforetheNewYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n;i++){
            int h = sc.nextInt();
            int m = sc.nextInt();
            int current = h * 60 + m;
            int remaining = 1440 - current;
            System.out.println(remaining);
        }
    }
}
