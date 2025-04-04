import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int K = Integer.parseInt(br.readLine());

        for (int t = 1; t <= K; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int total = 0;
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int di = Integer.parseInt(st.nextToken());
                int vi = Integer.parseInt(st.nextToken());
                if (di <= s * d) {
                    total += vi;
                }
            }
            sb.append("Data Set ").append(t).append(":\n").append(total).append("\n\n");
        }
        System.out.print(sb);
    }
}
