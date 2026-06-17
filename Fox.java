import java.util.Scanner;

public class Fox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Full row of '#'
                for (int j = 0; j < m; j++) {
                    System.out.print("#");
                }
            } else if ((i / 2) % 2 == 0) {
                // '#' at the end
                for (int j = 0; j < m - 1; j++) {
                    System.out.print(".");
                }
                System.out.print("#");
            } else {
                // '#' at the beginning
                System.out.print("#");
                for (int j = 0; j < m - 1; j++) {
                    System.out.print(".");
                }
            }

            System.out.println();
        }
    }
}
