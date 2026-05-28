import java.util.Scanner;

public class Hipster {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // maximum days with different socks
        int different = Math.min(a, b);

        // remaining socks of same color
        int remaining = Math.abs(a - b) / 2;

        System.out.println(different + " " + remaining);
    }
}
