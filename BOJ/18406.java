import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int n = N.length();
        int half = n / 2;
        int left = 0;
        int right = 0;

        for (int i = 0; i < half; i++) {
            left += N.charAt(i) - '0';
        }
        for (int i = half; i < n; i++) {
            right += N.charAt(i) - '0';
        }

        System.out.print(left == right ? "LUCKY" : "READY");
    }
}
