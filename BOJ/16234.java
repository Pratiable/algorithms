import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int days = 0;
        int[][] map = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Queue<Country> q = new LinkedList<>();
        int[] alliances = new int[2501];
        int[][] alliancesMap = new int[n][n];

        while (true) {
            for (int i = 0; i < n; i++) {
                Arrays.fill(visited[i], false);
                Arrays.fill(alliancesMap[i], -1);
            }
            int allianceCount = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (visited[i][j]) continue;
                    allianceCount++;
                    visited[i][j] = true;
                    int sum = map[i][j];
                    int cnt = 1;
                    q.clear();
                    q.add(new Country(i, j));
                    alliancesMap[i][j] = allianceCount;

                    while (!q.isEmpty()) {
                        Country now = q.poll();

                        for (int k = 0; k < 4; k++) {
                            int nx = now.x + dx[k];
                            int ny = now.y + dy[k];
                            if (nx < 0 || ny < 0 || nx >=n || ny >= n || visited[nx][ny]) continue;
                            int gap = Math.abs(map[now.x][now.y] - map[nx][ny]);
                            if (gap < l || gap > r) continue;
                            visited[nx][ny] = true;
                            cnt++;
                            sum += map[nx][ny];
                            alliancesMap[nx][ny] = allianceCount;
                            q.add(new Country(nx, ny));
                        }
                    }

                    alliances[allianceCount] = cnt == 1 ? -1 : sum / cnt;
                }
            }

            if (allianceCount == n * n) break;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (alliances[alliancesMap[i][j]] != -1) map[i][j] = alliances[alliancesMap[i][j]];
                }
            }
            days++;
        }

        System.out.println(days);
    }

    static class Country {
        int x, y;

        public Country(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}