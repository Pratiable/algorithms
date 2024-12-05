import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int k = Integer.parseInt(br.readLine());
            if (k == 0) break;

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                if (x == n || y == m) {
                    sb.append("divisa\n");
                } else if (x > n && y > m) {
                    sb.append("NE\n");
                } else if (x > n) {
                    sb.append("SE\n");
                } else if (y < m) {
                    sb.append("SO\n");
                } else {
                    sb.append("NO\n");
                }
            }
        }
        
        System.out.println(sb);
    }
}
