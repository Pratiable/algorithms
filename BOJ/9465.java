import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());

            int[] upper = new int[n];
            int[] lower = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                upper[i] = Integer.parseInt(st.nextToken());
                lower[i] = Integer.parseInt(st2.nextToken());
            }

            int[][] dp = new int[n + 1][3];
            dp[0][0] = upper[0];
            dp[0][1] = lower[0];

            for (int i = 1; i < n; i++) {
                dp[i][0] = Math.max(dp[i - 1][1], dp[i - 1][2]) + upper[i];
                dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][2]) + lower[i];
                dp[i][2] = Math.max(dp[i - 1][0], dp[i - 1][1]);
            }

            sb.append(Math.max(Math.max(dp[n - 1][0], dp[n - 1][1]), dp[n - 1][2])).append("\n");
        }

        System.out.println(sb);
    }
}