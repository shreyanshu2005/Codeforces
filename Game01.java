import java.util.*;
public class Game01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i<t;i++){
            String m = sc.next();
            int zero = 0;
            int one = 1;
            for(char c : m.toCharArray()){
                if(c == '0'){
                    zero++;
                }
                else{
                    one++;
                }

            }
            int moves = Math.min(zero, one);
            if(moves%2 == 1){
                System.out.println("DA");
            }
            else{
                System.out.println("NET");
            }
        }
    }
}
