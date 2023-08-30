import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int b = 1;
            int result = -1;

            while (true) {
                int a = k * b;

                int inner = a * (((m - 1) * m) / 2) * n;
                int outer = b * m * m * (((n - 1) * n) / 2);

                if (inner + outer > d) break;
                result = inner + outer;
                b++;
            }

            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }
}