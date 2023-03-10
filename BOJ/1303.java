import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int w = 0;
        int b = 0;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        char[][] matrix = new char[n][m];
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                matrix[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j]) continue;
                visited[i][j] = true;
                char color = matrix[i][j];
                int cnt = 1;
                Queue<int[]> queue = new LinkedList<>();
                queue.add(new int[]{i, j});

                while (!queue.isEmpty()) {
                    int[] now = queue.poll();

                    for (int k = 0; k < 4; k++) {
                        int nx = now[0] + dx[k];
                        int ny = now[1] + dy[k];
                        if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                        if (visited[nx][ny] || matrix[nx][ny] != color) continue;
                        visited[nx][ny] = true;
                        cnt++;
                        queue.add(new int[]{nx, ny});
                    }
                }

                int power = cnt * cnt;
                if (color == 'W') {
                    w += power;
                    continue;
                }
                b += power;
            }
        }

        System.out.printf("%d %d", w, b);
    }
}