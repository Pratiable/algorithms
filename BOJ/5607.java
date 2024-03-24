import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int as = 0, bs = 0;

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a > b) {
                as += a + b;
            } else if (b > a) {
                bs += a + b;
            } else {
                as += a;
                bs += b;
            }
        }

        System.out.printf("%d %d", as, bs);
    }
}