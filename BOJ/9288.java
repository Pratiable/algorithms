import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 1; t <= T; t++) {
            int n = Integer.parseInt(br.readLine());
            sb.append("Case " + t + ":\n");
            for (int i = 1; i <= n / 2; i++) {
                if (n - i > 6) continue;
                sb.append("(" + i + "," + (n - i) + ")\n");
            }
        }

        System.out.println(sb);
    }
}