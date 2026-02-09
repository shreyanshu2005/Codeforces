import java.util.*;
public class helpful {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        String[] nums = s.split("\\+");
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]);
            if(i!=nums.length-1){
                System.out.print("+");
            }
        }
    }
}
