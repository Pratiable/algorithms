import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] nums;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        nums = new int[n];
        dp = new int[n + 1][1002];

        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], Integer.MIN_VALUE);
        }

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        
        System.out.println(f(0, 1001));
    }

    static int f(int pos, int last) {
        if (pos == n) {
            return 0;
        }

        if (dp[pos][last] != Integer.MIN_VALUE) {
            return dp[pos][last];
        }

        if (nums[pos] < last) {
            dp[pos][last] = f(pos + 1, nums[pos]) + 1;
        }

        return dp[pos][last] = Math.max(dp[pos][last], f(pos + 1, last));
    }
}
