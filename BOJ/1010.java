import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        int[][] dp = new int[31][31];

        for (int i = 1; i < 31; i++) {
            for (int j = 1; j < 31; j++) {
                if (i == 1) {
                    dp[i][j] = j;
                    continue;
                }
                if (i == j) {
                    dp[i][j] = 1;
                    continue;
                }
                if (i > j) continue;
                dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
            }
        }

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(dp[a][b]).append("\n");
        }

        System.out.println(sb);
    }
}