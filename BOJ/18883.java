import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        int now = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == m - 1) {
                    sb.append(++now);
                    break;
                }
                sb.append(++now).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
