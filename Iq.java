import java.util.*;

public class Iq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int evenCount = 0, oddCount = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        boolean findEven = (evenCount == 1);

        for (int i = 0; i < n; i++) {
            if (findEven && arr[i] % 2 == 0) {
                System.out.println(i + 1);
                break;
            }
            if (!findEven && arr[i] % 2 != 0) {
                System.out.println(i + 1);
                break;
            }
        }

        sc.close();
    }
}