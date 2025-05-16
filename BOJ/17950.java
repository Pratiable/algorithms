import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int MOD = 1_000_000_007;
        long ans = 0;
        long tmp = x;

        for (int i = 0; i < h; i++) {
            int balls = Integer.parseInt(br.readLine());
            ans = (ans + (balls * tmp) % MOD) % MOD;
            tmp = (tmp * x) % MOD;
        }

        System.out.println(ans);
    }
}
