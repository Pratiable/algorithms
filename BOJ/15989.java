import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        int[] dp = new int[10001];
        dp[0] = 1;
        int[] nums = {1, 2, 3};

        for (int num : nums) {
            for (int i = num; i < 10001; i++) {
                dp[i] += dp[i - num];
            }
        }

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(dp[n]).append("\n");
        }

        System.out.println(sb);
    }
}
