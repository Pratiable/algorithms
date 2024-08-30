import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int mv = Integer.parseInt(st.nextToken());
        int mp = Integer.parseInt(st.nextToken());
        int ms = Integer.parseInt(st.nextToken());

        int max = mv + mp + ms;

        int[][] ppl = new int[n][2];
        sb.append(0).append(" ");

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());

            ppl[i][0] = v + p + s;
            ppl[i][1] = i;
        }

        Arrays.sort(ppl, (a, b) -> Integer.compare(b[0], a[0]));

        int cnt = 1;

        for (int i = 0; i < n; i++) {
            if (ppl[i][0] > max) continue;
            if (cnt == m) break;
            sb.append(ppl[i][1] + 1).append(" ");
            cnt++;
        }

        System.out.println(sb);
    }
}