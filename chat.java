import java.util.*;
public class chat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String pattern = "hello";
        int j = 0;
        for(int i = 0;i<s.length();i++){
            if(j<pattern.length() && s.charAt(i) == pattern.charAt(j)){
                j++;
            }
            
        }
        if(j == pattern.length()){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
