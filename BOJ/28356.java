import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][m];

        if (m == 1) {
            for (int i = 0; i < n; i++) {
                map[i][0] = i % 2 == 0 ? 1 : 2;
            }
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    map[i][j] = i % 2 == 0 ? j % 2 == 0 ? 1 : 2 : j % 2 == 0 ? 3 : 4;
                }
            }
        }

        sb.append(n == 1 && m == 1 ? 1 : n == 1 || m == 1 ? 2 : 4).append("\n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(map[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
