import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < T; t++) {
            int min = Integer.MAX_VALUE;
            int sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 7; i++) {
                int now = Integer.parseInt(st.nextToken());

                if (now % 2 == 0) {
                    sum += now;
                    min = Math.min(now, min);
                }
            }

            sb.append(sum).append(" ").append(min).append("\n");
        }

        System.out.println(sb);
    }
}
