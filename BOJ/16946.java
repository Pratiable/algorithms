import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int[][] map = new int[n][m];
        int[][] zone = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        int[] zoneAvailable = new int[500_001];
        Queue<Coord> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = line.charAt(j) -'0';
            }
        }

        int zoneCnt = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 1 || visited[i][j]) continue;
                int cnt = 1;
                visited[i][j] = true;
                zone[i][j] = zoneCnt;
                queue.add(new Coord(i, j));
                while (!queue.isEmpty()) {
                    Coord now = queue.poll();
                    for (int k = 0; k < 4; k++) {
                        int nx = now.x + dx[k];
                        int ny = now.y + dy[k];
                        if (nx < 0 || ny < 0 || nx >= n || ny >= m || visited[nx][ny]) continue;
                        if (map[nx][ny] != 0) continue;
                        visited[nx][ny] = true;
                        zone[nx][ny] = zoneCnt;
                        cnt++;
                        queue.add(new Coord(nx, ny));
                    }
                }

                zoneAvailable[zoneCnt] = cnt;
                zoneCnt++;
            }
        }

        ArrayList<Integer> visitedZone = new ArrayList<>(4);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] != 1) continue;
                int sum = 1;
                visitedZone.clear();
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx < 0 || ny < 0 || nx >= n || ny >= m || map[nx][ny] == 1 || visitedZone.contains(zone[nx][ny])) continue;
                    if (zone[nx][ny] == 0) continue;
                    visitedZone.add(zone[nx][ny]);
                    sum += zoneAvailable[zone[nx][ny]];
                }

                map[i][j] = sum % 10;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(map[i][j]);
            }
            sb.append("\n");
        }


        System.out.println(sb);
    }

    static class Coord {
        int x, y;

        public Coord(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}