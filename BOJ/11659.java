import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] sum = new int[n];
        st = new StringTokenizer(br.readLine());
        sum[0] = Integer.parseInt(st.nextToken());

        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            if (s == 1) {
                sb.append(sum[e - 1]).append("\n");
                continue;
            }

            sb.append(sum[e - 1] - sum[s - 2]).append("\n");
        }

        System.out.println(sb);
    }
}
