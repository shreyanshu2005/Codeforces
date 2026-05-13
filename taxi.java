import java.util.Scanner;

public class taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] count = new int[5];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            count[a]++;
        }

        int taxis = 0;

        // Groups of 4
        taxis += count[4];

        // Groups of 3
        taxis += count[3];
        count[1] -= Math.min(count[1], count[3]);

        // Groups of 2 together
        taxis += count[2] / 2;

        // One group of 2 left
        if (count[2] % 2 == 1) {
            taxis++;
            count[1] -= Math.min(count[1], 2);
        }

        // Remaining groups of 1
        if (count[1] > 0) {
            taxis += (count[1] + 3) / 4;
        }

        System.out.println(taxis);

        sc.close();
    }
}