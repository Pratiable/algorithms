import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[][] dp = new long[100001][4];
        dp[1][1] = 1;
        dp[1][2] = 0;
        dp[1][3] = 0;
        dp[2][1] = 0;
        dp[2][2] = 1;
        dp[2][3] = 0;
        dp[3][1] = 1;
        dp[3][2] = 1;
        dp[3][3] = 1;

        for (int i = 4; i < 100_001; i++) {
            dp[i][1] = (dp[i - 1][3] + dp[i - 1][2]) % 1_000_000_009;
            dp[i][2] = (dp[i - 2][1] + dp[i - 2][3]) % 1_000_000_009;
            dp[i][3] = (dp[i - 3][1] + dp[i - 3][2]) % 1_000_000_009;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int now = Integer.parseInt(br.readLine());
            sb.append((dp[now][1] + dp[now][2] + dp[now][3]) % 1_000_000_009).append("\n");
        }

        System.out.println(sb);
    }
}