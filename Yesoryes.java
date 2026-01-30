import java.util.*;
public class Yesoryes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            String charecter = sc.next();
            if(charecter.toLowerCase().equals("yes  ")){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }

}
