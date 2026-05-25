import java.util.Arrays;
import java.util.Scanner;

public class Restoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i = 0;i<4;i++){
            arr[i] = sc.nextInt();

        }
        Arrays.sort(arr);
        int sum = arr[3];
        int a = sum - arr[2];
        int b = sum - arr[1];
        int c = sum - arr[0];
        System.out.println(a+" "+b+" "+c);
    }
}
