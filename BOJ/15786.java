import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String S = br.readLine();

        for (int i = 0; i < M; i++) {
            String target = br.readLine();
            int idx = 0;

            for (int k = 0; k < target.length() && idx < N; k++) {
                if (target.charAt(k) == S.charAt(idx)) {
                    idx++;
                }
            }

            sb.append(idx == N ? "true" : "false").append("\n");
        }

        System.out.print(sb);
    }
}
