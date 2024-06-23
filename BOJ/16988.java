import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] map;
    static int max = Integer.MIN_VALUE;
    static int n, m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        place(0, 0, 0);
        System.out.println(max);
    }

    static void place(int depth, int x, int y) {
        if (depth == 2) {
            max = Math.max(max, countKill());
            return;
        }

        for (int i = x; i < n; i++) {
            for (int j = y; j < m; j++) {
                if (map[i][j] != 0) continue;
                map[i][j] = 1;
                if (j == m - 1) {
                    place(depth + 1, i + 1, 0);
                } else {
                    place(depth + 1, i, j + 1);
                }
                map[i][j] = 0;
            }
            y = 0;
        }
    }
    static int countKill() {
        boolean[][] visited = new boolean[n][m];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j] || map[i][j] != 2) continue;
                int localCnt = 1;
                boolean isFit = true;
                visited[i][j] = true;

                Queue<int[]> q = new LinkedList<>();
                q.add(new int[]{i, j});
                while (!q.isEmpty()) {
                    int[] cur = q.poll();
                    int x = cur[0];
                    int y = cur[1];
                    for (int k = 0; k < 4; k++) {
                        int nx = x + dx[k];
                        int ny = y + dy[k];
                        if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                        if (visited[nx][ny]) continue;
                        if (map[nx][ny] == 0) {
                            isFit = false;
                            continue;
                        }

                        if (map[nx][ny] == 2) {
                            visited[nx][ny] = true;
                            localCnt++;
                            q.add(new int[]{nx, ny});
                        }
                    }
                }

                if (isFit) cnt += localCnt;
            }
        }

        return cnt;
    }
}
