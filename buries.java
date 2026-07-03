import java.util.Scanner;

public class buries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int r = sc.nextInt();

        int i = 1;

        while (true) {
            int cost = i * k;

            if (cost % 10 == 0 || cost % 10 == r) {
                System.out.println(i);
                break;
            }

            i++;
        }
    }
}
