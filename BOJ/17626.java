import java.io.*;
import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1];

        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            int cnt = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++)
                cnt = Math.min(cnt, dp[i - j * j]);

            dp[i] = cnt + 1;
        }

        System.out.println(dp[n]);
    }
}
