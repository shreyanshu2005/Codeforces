import java.util.*;
public class Theatre {
        public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();

        long tilesLength = (n + a - 1) / a;
        long tilesWidth  = (m + a - 1) / a;

        long result = tilesLength * tilesWidth;

        System.out.println(result);
        }
    
       
}
