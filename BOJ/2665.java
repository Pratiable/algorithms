import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];
        int[][] counts = new int[n][n];
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = str.charAt(j) == '0' ? 1 : 0;
                counts[i][j] = Integer.MAX_VALUE;

            }
        }

        Queue<int[]> q = new LinkedList<>();
        counts[0][0] = 0;
        q.add(new int[]{0, 0, 0});

        while(!q.isEmpty()) {
            int[] now = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
                int nc = map[nx][ny] + now[2];
                if (nc >= counts[nx][ny]) continue;
                counts[nx][ny] = nc;
                q.add(new int[]{nx, ny, nc});
            }
        }

        System.out.println(counts[n - 1][n - 1]);
    }
}