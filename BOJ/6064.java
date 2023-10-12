import java.io.*;
import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        Loop:
        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int i = 0; i <= n; i++) {
                if ((x + m * i - y) % n == 0) {
                    sb.append(x + m * i).append("\n");
                    continue Loop;
                }
            }
            sb.append(-1).append("\n");
        }
        System.out.println(sb);
    }
}
