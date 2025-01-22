import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if (m < 45) {
                h--;
                m += 15;
                h = h < 0 ? 23 : h;
            } else {
                m -= 45;
            }

            sb.append("Case #").append(i + 1).append(": ").append(h).append(" ").append(m).append("\n");
        }

        System.out.println(sb);
    }
}