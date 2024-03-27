import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st, st2;
        StringBuilder sb = new StringBuilder();
        int[] a = {1, 2, 3, 3, 4, 10};
        int[] b = {1, 2, 2, 2, 3, 5, 10};

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            st2 = new StringTokenizer(br.readLine());
            int as = 0, bs = 0;

            for (int i = 0; i < 7; i++) {
                if (i == 6) {
                    bs += Integer.parseInt(st2.nextToken()) * b[i];
                    break;
                }

                as += Integer.parseInt(st.nextToken()) * a[i];
                bs += Integer.parseInt(st2.nextToken()) * b[i];
            }

            if (as > bs) {
                sb.append(String.format("Battle %d: Good triumphs over Evil\n", t + 1));
            } else if (bs > as) {
                sb.append(String.format("Battle %d: Evil eradicates all trace of Good\n", t + 1));
            } else {
                sb.append(String.format("Battle %d: No victor on this battle field\n", t + 1));
            }
        }

        System.out.println(sb);
    }
}