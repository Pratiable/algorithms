import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[][] map = new int[n][m];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < m; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int cnt = 0;

            for (int i = 0; i < m; i++) {
                int box = 0;
                for (int j = n - 1; j >= 0; j--) {
                    if (map[j][i] == 1) {
                        cnt += ((n - 1) - box) - j;
                        box++;
                    }
                }
            }
            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}