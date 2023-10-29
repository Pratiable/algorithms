import java.io.*;
import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                    continue;
                }
                map[i][j] = Integer.parseInt(st.nextToken()) + map[i][j - 1];
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < m; t++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()) - 1;
            int y1 = Integer.parseInt(st.nextToken()) - 1;
            int x2 = Integer.parseInt(st.nextToken()) - 1;
            int y2 = Integer.parseInt(st.nextToken()) - 1;
            int sum = 0;

            if (y2 == 0) {
                for (int i = x1; i <= x2; i++) {
                    sum += map[i][0];
                }
                sb.append(sum).append("\n");
                continue;
            }

            for (int i = x1; i <= x2; i++) {
                sum += map[i][y2] - (y1 == 0 ? 0 : map[i][y1 - 1]);
            }

            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }
}
