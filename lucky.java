import java.util.*;

public class lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count=0;
        String s = Long.toString(n);
        for(char c : s.toCharArray()){
            if((c == '4') ||(c=='7')){
                count++;
            }
            
        }
        if(count == 4 || count==7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
