import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String id = st.nextToken();
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int t = a + b + c;

            if (t >= 55 && a >= 10.5 && b >= 7.5 && c >= 12) {
                sb.append(id).append(" ").append(t).append(" PASS\n");
            } else {
                sb.append(id).append(" ").append(t).append(" FAIL\n");
            }
        }
        System.out.println(sb);
    }
}
