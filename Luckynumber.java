import java.util.*;
public class Luckynumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = (1L << (n + 1)) - 2;
        System.out.println(result);
    }
}
