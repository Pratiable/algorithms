import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            String N = st.nextToken();
            String M = st.nextToken();
            int n = 0;
            int m = 0;

            for (int i = 0; i < N.length(); i++) {
                char a = N.charAt(i);
                char b = M.charAt(i);

                if (a == b) continue;
                
                if (a == '0') {
                    n++;
                } else {
                    m++;
                }

            }

            sb.append(Math.max(n, m)).append("\n");
        }

        System.out.print(sb);
    }
}
