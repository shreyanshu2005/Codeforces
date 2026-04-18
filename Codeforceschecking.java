import java.util.Scanner;

public class Codeforceschecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         
        for(int i = 0;i<n;i++){
            String s = "codeforces";
            char target = sc.next().charAt(0);

            if (s.indexOf(target) != -1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
}
        }
    }
}
