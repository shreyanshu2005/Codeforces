import java.util.*;
public class waytoolong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int n = sc.nextInt();
        for (int i = 0;i<n;i++){
            String charecter = sc.next();
            int len = charecter.length();
            if(len>10){
            System.out.println(""+charecter.charAt(0)+(len-2)+charecter.charAt(len-1));
            }    
        else{
            System.out.println(charecter);
            }     
        }
        sc.close();
        
    }
}