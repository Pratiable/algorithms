import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        while ((str = br.readLine()) != null && !str.isEmpty()) {
            StringTokenizer st = new StringTokenizer(str);
            int M = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int L = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            for (int i = 0; i < N; i++) {
                int m = P / S;
                int p = L / R;
                int l = M * E;
                M = m;
                P = p;
                L = l;
            }

            sb.append(M).append("\n");
        }

        System.out.print(sb);
    }
}
