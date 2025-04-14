import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int group = 1;
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            boolean nasty = false;
            sb.append("Group ").append(group).append("\n");
            String[] names = new String[n];
            boolean[][] messages = new boolean[n][n - 1];
            StringTokenizer st;
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                names[i] = st.nextToken();
                for (int j = 0; j < n - 1; j++) {
                    messages[i][j] = st.nextToken().equals("P");
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (!messages[i][j]) {
                        nasty = true;
                        sb.append(names[(i + (n - 1 - j)) % n]).append(" was nasty about ").append(names[i]).append("\n");
                    }
                }
            }

            if (!nasty) sb.append("Nobody was nasty\n");
            sb.append("\n");
            group++;
        }

        System.out.println(sb);
    }
}