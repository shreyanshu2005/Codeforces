import java.util.Scanner;

public class Arraycolor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int t = sc.nextInt();
            int sum = 0;
            for(int j = 0;j<t;j++){
                sum+=sc.nextInt();
            }
            if(sum%2 == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
