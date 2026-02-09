import java.util.Scanner;

public class vowel {
    public static int vowel1(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(vowel1(s));
    }
}