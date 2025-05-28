import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = 1;
        String str;

        while (true) {
            str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int r = Integer.parseInt(st.nextToken());
            if (r == 0) break;

            int w = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            int sum = (int) (Math.pow(w, 2) + Math.pow(l, 2));
            int limit = r * r * 4;
            if (sum <= limit) {
                sb.append("Pizza ").append(t).append(" fits on the table.\n");
            } else {
                sb.append("Pizza ").append(t).append(" does not fit on the table.\n");
            }
            t++;
        }

        System.out.println(sb);
    }
}
