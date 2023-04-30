import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] dp = new long[N + 1];
        dp[0] = 1;

        for (int i = 1; i <= N; i++) {
            dp[i] = dp[i - 1] * i;
        }

        System.out.println(dp[N]);
    }
}
