import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        int[] sum = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            int cur = Integer.parseInt(br.readLine());
            sum[i] = sum[i - 1] + cur;
        }

        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            sb.append(sum[E] - sum[S - 1]).append("\n");
        }

        System.out.print(sb);
    }
}
