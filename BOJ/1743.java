import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int max = 0;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        boolean[][] matrix = new boolean[n][m];
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken()) - 1;
            int c = Integer.parseInt(st.nextToken()) - 1;

            matrix[r][c] = true;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j] || !matrix[i][j]) continue;
                visited[i][j] = true;
                int cnt = 1;
                Queue<int[]> queue = new LinkedList<>();
                queue.add(new int[]{i, j});

                while (!queue.isEmpty()) {
                    int[] now = queue.poll();

                    for (int l = 0; l < 4; l++) {
                        int nx = now[0] + dx[l];
                        int ny = now[1] + dy[l];
                        if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                        if (visited[nx][ny] || !matrix[nx][ny]) continue;
                        visited[nx][ny] = true;
                        cnt++;
                        queue.add(new int[]{nx, ny});
                    }
                }
                max = Math.max(cnt, max);
            }
        }

        System.out.println(max);
    }
}