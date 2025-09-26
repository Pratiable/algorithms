import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int p = Integer.parseInt(br.readLine());
            int max = -1;
            String maxName = "";
            for (int i = 0; i < p; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int cur = Integer.parseInt(st.nextToken());
                String name = st.nextToken();

                if (cur > max) {
                    max = cur;
                    maxName = name;
                }
            }

            sb.append(maxName).append("\n");
        }

        System.out.print(sb);
    }
}
