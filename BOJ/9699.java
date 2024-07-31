import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine()) + 1;

        for (int t = 1; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int max = 0;

            for (int i = 0; i < 5; i++) {
                int num = Integer.parseInt(st.nextToken());
                max = Math.max(max, num);
            }

            sb.append("Case #").append(t).append(": ").append(max).append("\n");
        }

        System.out.println(sb);
    }
}