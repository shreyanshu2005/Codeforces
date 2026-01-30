import java.util.*;
public class petya {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        String s1 = a.toLowerCase();
        String s2 = b.toLowerCase();

        for(int i = 0;i<a.length();i++){
            if(s1.charAt(i)>s2.charAt(i)){
                System.out.println(1);
                return;
            }
            else if(s1.charAt(i)<s2.charAt(i)){
                System.out.println(-1);
                return;
            }
            else{
                System.out.println(0);
            }

        }
}    
}
