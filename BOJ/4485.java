import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int prblmCnt = 1;
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            int min = Integer.MAX_VALUE;
            int[][] map = new int[n][n];
            int[][] lostMap = new int[n][n];
            StringTokenizer st;

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int i = 0; i < n; i++) {
                Arrays.fill(lostMap[i], Integer.MAX_VALUE);
            }

            Queue<int[]> queue = new LinkedList<>();
            lostMap[0][0] = map[0][0];
            queue.add(new int[]{0, 0, map[0][0]});

            while (!queue.isEmpty()) {
                int[] now = queue.poll();

                if (now[0] == n - 1 && now[1] == n - 1) {
                    min = Math.min(min, now[2]);
                    continue;
                }

                for (int i = 0; i < 4; i++) {
                    int nx = now[0] + dx[i];
                    int ny = now[1] + dy[i];

                    if (nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
                    if (lostMap[nx][ny] <= now[2] + map[nx][ny]) continue;
                    lostMap[nx][ny] = now[2] + map[nx][ny];
                    queue.add(new int[]{nx, ny, now[2] + map[nx][ny]});
                }
            }
            sb.append("Problem ").append(prblmCnt++).append(": ").append(min).append("\n");
        }
        System.out.println(sb);
    }
}
