import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        char[][] painting = new char[N][N];

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                painting[i][j] = str.charAt(j);
            }
        }
        boolean isOk = true;

        for (int i = 0; i < 2; i++) {
            Queue<Coordinate> queue = new LinkedList<>();
            boolean[][] visited = new boolean[N][N];
            int cnt = 0;

            for (int row = 0; row < N; row++) {
                for (int col = 0; col < N; col++) {
                    if (visited[row][col]) continue;
                    visited[row][col] = true;
                    queue.add(new Coordinate(row, col));
                    while(!queue.isEmpty()) {
                        Coordinate now = queue.poll();
                        char point = painting[now.x][now.y];
                        for (int j = 0; j < 4; j++) {
                            int nx = now.x + dx[j];
                            int ny = now.y + dy[j];
                            if (nx >= N || ny >= N || nx < 0 || ny < 0) continue;
                            if (visited[nx][ny]) continue;
                            if (isOk) {
                                if (point != painting[nx][ny]) continue;
                            } else if (point == 'B' && painting[nx][ny] != 'B') {
                                continue;
                            } else if (point != 'B' && painting[nx][ny] == 'B') {
                                continue;
                            }
                            visited[nx][ny] = true;
                            queue.add(new Coordinate(nx, ny));
                        }
                    }
                    cnt++;
                }
            }
            isOk = false;
            sb.append(cnt).append(" ");
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