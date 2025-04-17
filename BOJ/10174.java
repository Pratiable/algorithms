import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String str = br.readLine().trim().toLowerCase();
            boolean isPalindrome = true;
            for (int j = 0; j < str.length() / 2; j++) {
                if (str.charAt(j) != str.charAt(str.length() - 1 - j)) {
                    isPalindrome = false;
                    break;
                }
            }
            sb.append(isPalindrome ? "Yes\n" : "No\n");
        }

        System.out.println(sb);
    }
}