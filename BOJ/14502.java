import java.io.*;
import java.util.*;

public class Main {
    static int N, M, max;
    static int[] dx, dy;
    static int[][] map, copiedMap;
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        dx = new int[]{0, 1, 0, -1};
        dy = new int[]{1, 0, -1, 0};
        map = new int[N][M];
        visited = new boolean[N][M];

        max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int num = Integer.parseInt(st.nextToken());
                map[i][j] = num;
                if (num != 0) {
                    visited[i][j] = true;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0) {
                    find(0, i, j);
                }
                visited[i][j] = true;
            }
        }

        System.out.println(max);
    }

    static void find(int depth, int x, int y) {
        if (depth == 3) {
            copiedMap = Arrays.stream(map).map(int[]::clone).toArray(int[][]::new);
            Queue<Coordinate> queue = new LinkedList<>();
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (copiedMap[i][j] == 2) {
                        queue.add(new Coordinate(i, j));
                    }
                }
            }

            while (!queue.isEmpty()) {
                Coordinate now = queue.poll();

                for (int k = 0; k < 4; k++) {
                    int nextX = now.x + dx[k];
                    int nextY = now.y + dy[k];

                    if (nextX >= N || nextY >= M || nextY < 0 || nextX < 0) continue;
                    if (copiedMap[nextX][nextY] != 0) continue;
                    copiedMap[nextX][nextY] = 2;
                    queue.add(new Coordinate(nextX, nextY));
                }
            }

            int cnt = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (copiedMap[i][j] == 0) cnt++;
                }
            }

            max = Math.max(max, cnt);
            return;
        }

        int startY = y;

        for (int i = x; i < N; i++) {
            for (int j = startY; j < M; j++) {
                if (visited[i][j]) continue;
                if (map[i][j] != 0) continue;
                map[i][j] = 1;
                find(depth + 1, i, j);
                map[i][j] = 0;
            }
            startY = 0;
        }
    }

    static class Coordinate {
        int x, y;
        Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}