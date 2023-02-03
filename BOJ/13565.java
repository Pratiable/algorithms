import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        boolean isAvailable = false;

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        boolean[][] map = new boolean[n][m];
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                if (str.charAt(j) == '1'){
                    map[i][j] = true;
                    visited[i][j] = true;
                } else if (i == 0) {
                    visited[i][j] = true;
                    queue.add(new int[]{0, j});
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] now = queue.poll();

            if (now[0] == n - 1) {
                isAvailable = true;
                break;
            }

            for (int i = 0; i < 4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if (visited[nx][ny] || map[nx][ny]) continue;
                visited[nx][ny] = true;
                queue.add(new int[]{nx, ny});
            }
        }

        System.out.println(isAvailable ? "YES" : "NO");
    }
}