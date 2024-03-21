import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] dp = new int[101];
        int inc = 1;

        for (int i = 1; i < 101; i++) {
            dp[i] += dp[i - 1] + inc;
            inc = inc + ((2 * i) + 1);
        }


        while (true) {
            int now = Integer.parseInt(br.readLine());
            if (now == 0) break;
            sb.append(dp[now]).append("\n");
        }

        System.out.println(sb);
    }
}