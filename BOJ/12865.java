import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            items[i] = new Item(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        int[][] dp = new int[n][k + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], Integer.MIN_VALUE);
        }
        dp[0][0] = 0;
        if (items[0].w <= k) dp[0][items[0].w] = items[0].v;

        for (int i = 1; i < n; i++) {
            Item item = items[i];
            for (int j = 0; j < k + 1; j++) {
                if (dp[i - 1][j] != Integer.MIN_VALUE && j + item.w <= k) {
                    dp[i][j + item.w] = Math.max(dp[i][j + item.w], dp[i - 1][j] + item.v);
                }
                dp[i][j] = Math.max(dp[i][j], dp[i - 1][j]);
            }
        }

        int max = 0;
        for (int i = 0; i < k + 1; i++) {
            max = Math.max(dp[n - 1][i], max);
        }

        System.out.println(max);
    }

    static class Item {
        int w, v;

        public Item(int w, int v) {
            this.w = w;
            this.v = v;
        }
    }
}