import java.util.Arrays;
import java.util.Scanner;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String guest = sc.nextLine();
        String host = sc.nextLine();
        String pile = sc.nextLine();

        // combine guest and host names
        String combined = guest + host;

        // convert to char arrays
        char[] arr1 = combined.toCharArray();
        char[] arr2 = pile.toCharArray();

        // sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // compare
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
