import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        for (int tc = 0; tc < T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int cnt = 0;

            int[][] map = new int[M][N];

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[x][y] = 1;
            }

            Queue<Coordinate> queue = new LinkedList<>();

            for (int row = 0; row < M; row++) {
                for (int col = 0; col < N; col++) {
                    if (map[row][col] == 1) {
                        queue.add(new Coordinate(row, col));
                        cnt++;
                    }

                    while(!queue.isEmpty()) {
                        Coordinate now = queue.poll();
                        for (int j = 0; j < 4; j++) {
                            int nx = now.x + dx[j];
                            int ny = now.y + dy[j];

                            if (nx < 0 || nx >= M || ny < 0 || ny >= N) continue;
                            if (map[nx][ny] != 1) continue;
                            map[nx][ny] = 2;
                            queue.add(new Coordinate(nx, ny));
                        }
                    }
                }
            }
            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }

    static class Coordinate {
        int x, y;

        Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}