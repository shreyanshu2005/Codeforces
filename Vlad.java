import java.util.*;
public class Vlad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 0;i<n;i++){
            String s = sc.next();
            int acount = 0;
            int bcount = 0;
            for(int j = 0;j<s.length();j++){
                if(s.charAt(j) == 'A'){
                acount++;
            }
            else{
                bcount++;
            }
            }
            
        if(acount>bcount){
            System.out.println('A');
        }
        else{
            System.out.println('B');
        }

        }
        
    }
    

}
