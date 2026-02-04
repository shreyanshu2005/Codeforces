import java.util.*;
public class Anto{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acount = 0;
        int dcount = 0;
        int n = sc.nextInt();
        String s = sc.next();
        for(int i = 0;i<n;i++){
            if(s.charAt(i)=='A'){
                acount++;
            }
            else if(s.charAt(i)=='D'){
                dcount++;
            }
        }
        if(acount >dcount){
            System.out.println("Anton");
        }
        else if(acount == dcount){
            System.out.println("Friendship");
        }
        else{
            System.out.println("Danik");
        }
    }

}