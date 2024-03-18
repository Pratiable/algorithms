import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            int odd = 0;
            int even = 0;
            int n = Integer.parseInt(st.nextToken());

            for (int i = 0; i < n; i++) {
                int now = Integer.parseInt(st.nextToken());

                if (now % 2 == 0) {
                    even += now;
                } else {
                    odd += now;
                }
            }

            sb.append(odd == even ? "TIE\n" : odd > even ? "ODD\n" : "EVEN\n");
        }

        System.out.println(sb);
    }
}