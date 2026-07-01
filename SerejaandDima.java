import java.util.Scanner;

public class SerejaandDima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int left = 0;
        int right = n - 1;
        int sereja = 0;
        int dima = 0;
        for (int i = 0; i < n; i++) {
            int x;
            if (a[left] > a[right]) {
                x = a[left];
                left++;
            } else {
                x = a[right];
                right--;
            }

            if (i % 2 == 0) {
                sereja += x;
            } else {
                dima += x;
            }
        }
        System.out.println(sereja + " " + dima);
    }
}
