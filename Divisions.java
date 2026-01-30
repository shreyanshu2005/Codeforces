import java.util.*;
public class Divisions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int rating = sc.nextInt();
            
            if(1900 <= rating){
                System.out.println("Division 1");
            }
            if(1600 <= rating && rating<= 1899){
                System.out.println("Division 2");

            }
            else if(1400 <= rating && rating <= 1599){
                System.out.println("Division 3");
            }
            else if(rating<=1399){
                System.out.println("Division 4");
            }
        }
        
    }
}
