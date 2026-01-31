import java.util.*;
public class again{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int Number = sc.nextInt();
            int a = Number%10;
            int b = a + (Number/10);
            System.out.println(b);
        } 
    }
}