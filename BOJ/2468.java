import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Set<Integer> set = new HashSet<>();
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];
        int max = 1;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int now = Integer.parseInt(st.nextToken());
                set.add(now);
                map[i][j] = now;
            }
        }

        for (int height: set) {
            int cnt = 0;
            boolean[][] visited = new boolean[n][n];
            Queue<int[]> queue = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (map[i][j] <= height) {
                        visited[i][j] = true;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (visited[i][j]) continue;
                    if (map[i][j] <= height) continue;
                    visited[i][j] = true;
                    queue.add(new int[]{i, j});

                    while (!queue.isEmpty()) {
                        int[] now = queue.poll();
                        for (int k = 0; k < 4; k++) {
                            int nx = now[0] + dx[k];
                            int ny = now[1] + dy[k];
                            if (nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
                            if (map[i][j] <= height) continue;
                            if (visited[nx][ny]) continue;
                            visited[nx][ny] = true;
                            queue.add(new int[]{nx, ny});
                        }
                    }
                    cnt++;
                }
            }
            max = Math.max(cnt, max);
        }

        System.out.println(max);
    }
}