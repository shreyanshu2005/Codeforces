import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = a+b*c;
        int e = a*(b+c);
        int f = a*b*c;
        int g = (a+b)*c;
        int h = a+b+c;

        System.out.println(Math.max(h,Math.max(Math.max(e, f), Math.max(d, g))));
    }
}
