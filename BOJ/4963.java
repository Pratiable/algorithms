import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
        int[] dy = {1, 1, 0, -1, -1, -1, 0, 1};

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            if (N == 0 && M == 0) break;
            int[][] map = new int[N][M];
            int cnt = 0;

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            Queue<Coordinate> queue = new LinkedList<>();

            for (int row = 0; row < N; row++) {
                for (int col = 0; col < M; col++) {
                    if (map[row][col] == 1) {
                        queue.add(new Coordinate(row, col));
                        cnt++;
                        map[row][col] = 0;

                        while (!queue.isEmpty()) {
                            Coordinate now = queue.poll();
                            for (int k = 0; k < 8; k++) {
                                int nx = now.x + dx[k];
                                int ny = now.y + dy[k];

                                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
                                if (map[nx][ny] != 1) continue;
                                map[nx][ny] = 0;
                                queue.add(new Coordinate(nx, ny));
                            }
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