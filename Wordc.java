import java.util.*;
public class Wordc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c = sc.nextLine().toCharArray();
        if(c.length >0){
            c[0]=Character.toUpperCase(c[0]);

        }
        System.out.println(new String(c));
    }
}
