import java.util.Scanner;
public class Squarestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            String s = sc.next();
            int m = s.length();
            if(m%2!=0){
                System.out.println("NO");
                continue;
            }
            String first = s.substring(0,m/2);
            String second = s.substring(m/2);
            if(first.equals(second)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
