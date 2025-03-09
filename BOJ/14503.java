import java.io.*;
import java.util.*;

public class Main {
    static int[][] map;
    static int n, m, cnt;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        cnt = 0;

        map = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        while (true) {
            if (map[x][y] == 0) {
                map[x][y] = 2;
                cnt++;
            }

            boolean isAreaCleaned = true;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if (map[nx][ny] == 0) {
                    isAreaCleaned = false;
                    break;
                }
            }

            if (isAreaCleaned) {
                int nd = d == 0 ? 2 : d == 1 ? 3 : d == 2 ? 0 : 1;
                int nx = x + dx[nd];
                int ny = y + dy[nd];
                if (map[nx][ny] == 1) break;
                x = nx;
                y = ny;
            } else {
                int nd = d == 0 ? 3 : d - 1;
                int nx = x + dx[nd];
                int ny = y + dy[nd];
                if (map[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                    d = nd;
                } else {
                    d = nd;
                }
            }
        }

        System.out.println(cnt);
    }
}