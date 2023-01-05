import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int[] dx = new int[]{-2, -2, -1, 1, 2, 2, 1, -1};
        int[] dy = new int[]{-1, 1, 2, 2, 1, -1, -2, -2};
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int I = Integer.parseInt(br.readLine());
            int[][] map = new int[I][I];
            boolean[][] visited = new boolean[I][I];
            st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int targetX = Integer.parseInt(st.nextToken());
            int targetY = Integer.parseInt(st.nextToken());

            Queue<Coordinate> queue = new LinkedList<>();
            queue.add(new Coordinate(startX, startY, 0));

            while (!queue.isEmpty()) {
                Coordinate now = queue.poll();

                if (targetX == now.x && targetY == now.y) {
                    min = Math.min(min, now.count);
                    break;
                }

                for (int j = 0; j < 8; j++) {
                    int nx = now.x + dx[j];
                    int ny = now.y + dy[j];

                    if (nx < 0 || ny < 0 || nx >= I || ny >= I) continue;
                    if (visited[nx][ny]) continue;
                    visited[nx][ny] = true;
                    queue.add(new Coordinate(nx, ny, now.count + 1));
                }
            }

            sb.append(min).append("\n");
        }
        System.out.println(sb);
    }
}

class Coordinate {
    int x, y, count;

    Coordinate(int x, int y, int count) {
        this.x = x;
        this.y = y;
        this.count = count;
    }
}