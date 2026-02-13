import java.util.*;
public class Medium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int [] arr = {a,b,c};
            Arrays.sort(arr);
            System.out.println(arr[1]);
        }
    }
}
