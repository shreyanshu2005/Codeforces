import java.util.Scanner;

public class CoverinWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int m = sc.nextInt();
            String s = sc.next();
            if(s.contains("...")){
                System.out.println(2);
            }else{
                int count = 0;
                for(char c :s.toCharArray()){
                    if(c == '.'){
                        count++;
                    }   
                }
                System.out.println(count);
            }
        }
    }
}
