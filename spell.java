import java.util.*;
public class spell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
                int m = sc.nextInt();
                String s = sc.next();
                if(m!=5){
                    System.out.println("NO");
                    
                }
                else{
                char[] arr1 = s.toCharArray();
                char[] arr2 = {'T', 'i', 'm', 'u', 'r'};
                Arrays.sort(arr1);
                Arrays.sort(arr2);
                if(Arrays.equals(arr1,arr2)){
                    System.out.println("YES");
                    
                }
                else{
                    System.out.println("NO");
                }
            }
                
            
 
        }
    }
}
