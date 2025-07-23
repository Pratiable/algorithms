import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        boolean[][] map = new boolean[n][n];
        long[][] dp = new long[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = st.nextToken().equals("1");
            }
        }
        dp[0][0] = map[0][0] ? 1L : 0L;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    continue;
                } else if (i == 0) {
                    dp[i][j] = map[i][j] ? (dp[i][j - 1] << 1) | 1L : dp[i][j - 1] << 1;
                } else if (j == 0) {
                    dp[i][j] = map[i][j] ? (dp[i - 1][j] << 1) | 1L : dp[i - 1][j] << 1;
                } else {
                    dp[i][j] = map[i][j] ? (Math.max(dp[i][j - 1], dp[i - 1][j]) << 1) | 1L : Math.max(dp[i][j - 1], dp[i - 1][j]) << 1;
                }
            }
        }

        System.out.println(dp[n - 1][n - 1]);
    }
}
