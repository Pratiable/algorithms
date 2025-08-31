import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Counsel[] counsels = new Counsel[N + 2];
        int[] dp = new int[N + 2];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            counsels[i] = new Counsel(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        for (int i = 1; i <= N; i++) {
            Counsel cur = counsels[i];
            dp[i] = Math.max(dp[i], dp[i - 1]);
            if (cur.days + i - 1 > N) {
                dp[N + 1] = Math.max(dp[i], dp[N + 1]);
                continue;
            }

            dp[i + cur.days] = Math.max(dp[i + cur.days], dp[i] + cur.earn);
        }

        System.out.println(Math.max(dp[N], dp[N + 1]));
    }

    static class Counsel {
        int days, earn;

        public Counsel(int days, int earn) {
            this.days = days;
            this.earn = earn;
        }
    }
}