import java.util.HashSet;
import java.util.Scanner;
public class Horseshoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();
        HashSet<Integer> colors = new HashSet<>();
        colors.add(s1);
        colors.add(s2);
        colors.add(s3);
        colors.add(s4);

        System.out.println(4 - colors.size());
    }
}
