import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] pixel = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int sum = 0;
                for (int k = 0; k < 3; k++) {
                    sum += Integer.parseInt(st.nextToken());
                }
                pixel[i][j] = sum / 3;
            }
        }

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                pixel[i][j] = pixel[i][j] >= T ? 255 : 0;
            }
        }

        Queue<int[]> queue = new LinkedList<>();
        int count = 0;

        boolean[][] visited = new boolean[N][M];
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (visited[i][j] || pixel[i][j] == 0) continue;
                queue.clear();
                visited[i][j] = true;
                queue.add(new int[]{i, j});
                count++;

                while (!queue.isEmpty()) {
                    int[] cur = queue.poll();

                    for (int k = 0; k < 4; k++) {
                        int nx = cur[0] + dx[k];
                        int ny = cur[1] + dy[k];

                        if (nx < 0 || ny < 0 || nx >= N || ny >= M || visited[nx][ny]) continue;
                        if (pixel[nx][ny] == 0) continue;
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }

        System.out.println(count);
    }
}
