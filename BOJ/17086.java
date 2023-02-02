import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int max = 1;
        boolean[][] map = new boolean[n][m];
        int[][] move = new int[n][m];
        int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
        int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                if (Objects.equals(st.nextToken(), "1")) {
                    map[i][j] = true;
                    move[i][j] = -1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (move[i][j] != 0) continue;
                Queue<int[]> queue = new LinkedList<>();
                boolean[][] visited = new boolean[n][m];
                visited[i][j] = true;
                queue.add(new int[]{i, j, 0});
                int min = Integer.MAX_VALUE;

                Loop:
                while(!queue.isEmpty()) {
                    int[] now = queue.poll();
                    for (int k = 0; k < 8; k++) {
                        int nx = now[0] + dx[k];
                        int ny = now[1] + dy[k];
                        if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                        if (map[nx][ny]) {
                            min = Math.min(min, now[2] + 1);
                            break Loop;
                        }
                        if (move[nx][ny] > 0) {
                            min = Math.min(min, move[nx][ny] + now[2] + 1);
                            continue;
                        }
                        if (visited[nx][ny]) continue;
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny, now[2] + 1});
                    }
                }
                move[i][j] = min;
                max = Math.max(min, max);
            }
        }
        System.out.println(max);
    }
}