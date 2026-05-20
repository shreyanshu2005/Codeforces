import java.util.Scanner;

public class tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int sum = 0;
        int max=0;
    
        for(int i = 0;i<s;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            sum-=a;
            sum+=b;
            max = Math.max(max, sum);
        }
         System.out.println(max);
    }
}
