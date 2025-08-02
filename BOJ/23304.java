import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int length = str.length();
        boolean isPalindrome = true;

        while (length > 1) {
            if (!checkPalindrome(str, length - 1)) {
                isPalindrome = false;
                break;
            }

            length /= 2;
        }

        System.out.println(isPalindrome ? "AKARAKA" : "IPSELENTI");
    }

    static boolean checkPalindrome(String s, int right) {
        int left = 0;

        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }

        return true;
    }
}
