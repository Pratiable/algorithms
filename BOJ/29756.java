import java.io.*;
import java.util.*;
import java.math.*;

class Main {
    static int[] scores, hps;
    static int[][] dp;
    static int n, k;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        scores = new int[n];
        hps = new int[n];
        dp = new int[n + 1][101];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            hps[i] = Integer.parseInt(st.nextToken());
        }

        f(0, 0, 100);

        int max = 0;

        for (int i = 0; i < 101; i++) {
            max = Math.max(max, dp[n][i]);
        }

        System.out.println(max);
    }

    static void f(int round, int score, int hp) {
        if (round == n) {
            return;
        }

        int rHp = Math.min(hp + k, 100);
        int dHp = Math.min(rHp - hps[round], 100);

        if (dHp >= 0 && dp[round + 1][dHp] < score + scores[round]) {
            dp[round + 1][dHp] = score + scores[round];
            f(round + 1, score + scores[round], dHp);
        }

        if (dp[round + 1][rHp] <= score) {
            dp[round + 1][rHp] = score;
            f(round + 1, score, rHp);
        }
    }
}
