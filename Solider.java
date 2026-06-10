import java.util.Scanner;

public class Solider {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int maxPos = 0;
        int minPos = 0;

        // Find the first occurrence of the maximum element
        for (int i = 0; i < n; i++) {
            if (a[i] > a[maxPos]) {
                maxPos = i;
            }
        }

        // Find the last occurrence of the minimum element
        for (int i = 0; i < n; i++) {
            if (a[i] <= a[minPos]) {
                minPos = i;
            }
        }

        int ans = maxPos + (n - 1 - minPos);

        // If the maximum element is originally after the minimum element,
        // one swap is counted twice
        if (maxPos > minPos) {
            ans--;
        }

        System.out.println(ans);

        sc.close();
    }
}
