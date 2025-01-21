import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int x = Math.abs(x1 - x2);
            int y = Math.abs(y1 - y2);

            if ((int) Math.pow(x, 2) + (int) Math.pow(y, 2) == 5) {
                sb.append("Case ").append(t + 1).append(": YES").append("\n");
            } else {
                sb.append("Case ").append(t + 1).append(": NO").append("\n");
            }
        }

        System.out.println(sb);
    }
}