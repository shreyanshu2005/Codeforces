import java.util.Scanner;
import java.util.Set;

import java.util.HashSet; 
public class wannabe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> level = new HashSet<>();
        int m = sc.nextInt();
        for(int i = 0;i<m;i++){
            level.add(sc.nextInt());
        }
        int q = sc.nextInt();
        for(int j = 0;j<q;j++){
            level.add(sc.nextInt());

        }
        if(level.size() == n){
            System.out.println("I become the guy.");
        }
        else{
            System.out.println("Oh, my keyboard!");
        }
    }
}
