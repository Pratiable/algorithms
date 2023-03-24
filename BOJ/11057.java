import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] dp = new int[1002][10];
        for (int i = 0, j = 10; i < 10; i++, j--) {
            dp[1][i] = j;
            dp[2][0] += j;
        }

        for (int i = 2; i < 1001; i++) {
            for (int j = 1; j < 10; j++) {
                int now = (dp[i][j - 1] - dp[i - 1][j - 1] + 10_007) % 10_007;
                dp[i][j] = now;
                dp[i + 1][0] += now;
            }
            dp[i + 1][0] = (dp[i + 1][0] % 10_007 + dp[i][0] % 10_007) % 10_007;
        }
        System.out.println(dp[n][0]);
    }
}
