import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[100001];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;
        dp[4] = 2;
        dp[5] = 1;
        dp[6] = 2;
        dp[7] = 1;

        if (n < 8) {
            System.out.println(dp[n]);
            return;
        }

        for (int i = 8; i < n + 1; i++) {
            dp[i] = Math.min(Math.min(Math.min(dp[i - 1] + 1, dp[i - 2] + 1), dp[i - 5] + 1), dp[i - 7] + 1);
        }

        System.out.println(dp[n]);
    }
}