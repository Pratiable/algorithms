import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] costs;
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        costs = new int[n + 1];
        dp = new int[1001];

        for (int i = 1; i < n + 1; i++) {
            costs[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j <= i; j++) {
                dp[i] = Math.max(dp[i], costs[i - j] + dp[j]);
            }
        }

        System.out.println(dp[n]);
    }
}