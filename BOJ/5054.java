import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                int now = Integer.parseInt(st.nextToken());
                min = Math.min(min, now);
                max = Math.max(max, now);
            }
            
            sb.append((max - min) * 2).append("\n");
        }

        System.out.println(sb);
    }
}