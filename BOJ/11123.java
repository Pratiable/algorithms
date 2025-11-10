import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int cnt = 0;
            int[][] map = new int[H][W];
            boolean[][] visited = new boolean[H][W];
            Queue<int[]> queue = new LinkedList<>();

            for (int i = 0; i < H; i++) {
                String str = br.readLine();
                for (int j = 0; j < W; j++) {
                    map[i][j] = str.charAt(j) == '#' ? 1 : 0;
                }
            }

            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (map[i][j] == 0 || visited[i][j]) continue;
                    cnt++;
                    visited[i][j] = true;
                    queue.add(new int[]{i, j});

                    while (!queue.isEmpty()) {
                        int[] cur = queue.poll();
                        int x = cur[0];
                        int y = cur[1];

                        for (int k = 0; k < 4; k++) {
                            int nx = x + dx[k];
                            int ny = y + dy[k];
                            if (nx >= H || ny >= W || nx < 0 || ny < 0) continue;
                            if (visited[nx][ny] || map[nx][ny] == 0) continue;
                            visited[nx][ny] = true;
                            queue.add(new int[]{nx, ny});
                        }
                    }
                }
            }

            sb.append(cnt).append("\n");
        }

        System.out.print(sb);
    }
}
