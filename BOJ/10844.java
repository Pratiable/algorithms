import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long sum = 0;
        long[][] dp = new long[101][11];

        for (int i = 1; i < 10; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i < 101; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j + 1] % 1_000_000_000;
                    continue;
                }
                dp[i][j] = dp[i - 1][j - 1] % 1_000_000_000 + dp[i - 1][j + 1] % 1_000_000_000;
            }
        }

        for (int i = 0; i < 10; i++) {
            sum = (sum + dp[n][i] % 1_000_000_000) % 1_000_000_000;
        }

        System.out.println(sum);
    }
}