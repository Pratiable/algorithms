import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            String[] pwd = new String[n];
            for (int i = 0; i < n; i++) {
                pwd[i] = br.readLine();
            }
            sb.append("Scenario #").append(t + 1).append(":\n");

            int m = Integer.parseInt(br.readLine());
            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int length = Integer.parseInt(st.nextToken());

                for (int j = 0; j < length; j++) {
                    int now = Integer.parseInt(st.nextToken());
                    sb.append(pwd[now]);
                }
                sb.append("\n");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}