import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;
        int[] nums = new int[n + 1];
        int[] dp = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i < n + 1; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        if (n == 1) {
            System.out.println(nums[1]);
            return;
        }

        dp[1] = nums[1];

        for (int i = 2; i < n + 1; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
        }

        for (int i = 1; i < n + 1; i++) {
            max = Math.max(dp[i], max);
        }

        System.out.println(max);
    }
}