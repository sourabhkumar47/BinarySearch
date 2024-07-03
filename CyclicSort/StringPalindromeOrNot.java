import java.util.Locale;

public class StringPalindromeOrNot {
    public static void main(String[] args) {
        String nm = ("abcba");

        System.out.println(isPalindrome(nm));
    }

    static boolean isPalindrome(String nm) {
        nm = nm.toLowerCase();
        for (int i = 0; i < nm.length() / 2; i++) {
            char start = nm.charAt(i);
            char end = nm.charAt(nm.length() - 1 -i);

            if (start != end){
                return false;
            }

        }
        return true;
    }
}
