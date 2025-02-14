import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());

            sb.append("#".repeat(Math.max(0, n))).append('\n');

            for (int i = 0; i < n - 2; i++) {
                sb.append('#').append("J".repeat(n - 2)).append('#').append('\n');
            }

            if (n > 1) {
                sb.append("#".repeat(n)).append('\n');
            }

            if (t < T - 1) {
                sb.append('\n');
            }
        }

        System.out.println(sb);
    }
}