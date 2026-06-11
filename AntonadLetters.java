import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AntonadLetters {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Set<Character> letters = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                letters.add(c);
            }
        }

        System.out.println(letters.size());
    }
}
