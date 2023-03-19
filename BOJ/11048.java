import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] dx = {1, 0, 1};
        int[] dy = {0, 1, 1};

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];
        int[][] mem = new int[n][m];
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        mem[0][0] = map[0][0];

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});

        while (!queue.isEmpty()) {
            int[] now = queue.poll();

            for (int i = 0; i < 3; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];

                if (nx >= n || ny >= m || nx < 0 || ny < 0) continue;
                if (mem[nx][ny] >= mem[now[0]][now[1]] + map[nx][ny] && visited[nx][ny]) continue;
                visited[nx][ny] = true;
                mem[nx][ny] = mem[now[0]][now[1]] + map[nx][ny];
                queue.add(new int[]{nx, ny});
            }
        }

        System.out.println(mem[n - 1][m - 1]);
    }
}