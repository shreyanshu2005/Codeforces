import java.util.Scanner;

public class QueueAtschool {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        char[] s = sc.next().toCharArray();

        for (int time = 0; time < t; time++) {
            int i = 0;
            while (i < n - 1) {
                if (s[i] == 'B' && s[i + 1] == 'G') {
                    char temp = s[i];
                    s[i] = s[i + 1];
                    s[i + 1] = temp;
                    i += 2; // skip the next position
                } else {
                    i++;
                }
            }
        }

        System.out.println(new String(s));
    }
}
