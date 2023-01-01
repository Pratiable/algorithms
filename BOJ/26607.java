import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n, k, x, max;
    static int[][] status;
    static int[][][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        max = 0;
        dp = new int[81][81][16001];
        for (int x = 0; x < 81; x++) {
            for (int y = 0; y < 81; y++) {
                Arrays.fill(dp[x][y], -1);
            }
        }
        status = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            status[i] = new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        }

        System.out.println(dfs(0, 0, 0));
    }

    static int dfs(int depth, int idx, int aSum) {
        if (depth == k) {
            return aSum * ((k * x) - aSum);
        }

        if (idx == n) {
            return Integer.MIN_VALUE;
        }

        if (dp[depth][idx][aSum] != -1) {
            return dp[depth][idx][aSum];
        }

        dp[depth][idx][aSum] = Math.max(dfs(depth, idx + 1, aSum), dfs(depth + 1, idx + 1, aSum + status[idx][0]));
        return dp[depth][idx][aSum];
    }
}