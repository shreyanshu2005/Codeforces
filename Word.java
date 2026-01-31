import java.util.*;
public class Word {
    public static void main(String[] args) {
        int upper_count = 0;
        int lower_count = 0;
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)){
                lower_count++;
            }
            else if(Character.isUpperCase(ch)){
                upper_count++;
            }
        }
        if(upper_count<=lower_count){
            System.out.println(s.toLowerCase());
        }
        else {
            System.out.println(s.toUpperCase());
        }
        sc.close();
    }
}
