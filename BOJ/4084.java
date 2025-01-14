import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0 && c == 0 && d == 0) break;
            if (a == b && b == c && c == d) {
                sb.append(0).append("\n");
                continue;
            }

            int cnt = 0;
            while (!(a == b && b == c && c == d)) {
                int na = Math.abs(a - b);
                int nb = Math.abs(b - c);
                int nc = Math.abs(c - d);
                int nd = Math.abs(d - a);
                a = na;
                b = nb;
                c = nc;
                d = nd;
                cnt++;
            }
            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}