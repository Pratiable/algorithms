import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            String p = st.nextToken();
            int idx = 0;
            int cnt = 0;

            while (idx < s.length()) {
                if (s.startsWith(p, idx)) {
                    cnt++;
                    idx += p.length();
                } else {
                    cnt++;
                    idx++;
                }
            }

            sb.append(cnt).append("\n");
        }

        System.out.print(sb);
    }
}
