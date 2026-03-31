import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int T = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            int page = S * T;
            int cnt = N / page;
            int mod = N % page;
            int time = cnt * (T + R);

            if (mod == 0) {
                time -= R;
            } else {
                time += (mod + S - 1) / S;
            }

            sb.append(time).append("\n");
        }

        System.out.print(sb);
    }
}
