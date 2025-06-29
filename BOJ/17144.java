import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int[] topPurifierIdx = {3, 0, 1, 2};
        int[] bottomPurifierIdx = {1, 0, 3, 2};
        int[][] room = new int[r][c];
        int[][] diffusionMap = new int[r][c];
        int botIdx = 0;

        for (int i = 0; i < r; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < c; j++) {
                room[i][j] = Integer.parseInt(st.nextToken());
                if (room[i][j] == -1) botIdx = i;
            }
        }
        int topIdx = botIdx - 1;

        for (int T = 0; T < t; T++) {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (room[i][j] <= 4) continue;
                    int availableCount = 0;
                    int separatedDusts = (int) Math.floor((double) room[i][j] / 5);
                    for (int k = 0; k < 4; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if (nx < 0 || ny < 0 || nx >= r || ny >= c || room[nx][ny] == -1) continue;
                        availableCount++;
                        diffusionMap[nx][ny] += separatedDusts;
                    }
                    room[i][j] -= separatedDusts * availableCount;
                }
            }

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    room[i][j] += diffusionMap[i][j];
                    diffusionMap[i][j] = 0;
                }
            }

            int tx = topIdx;
            int ty = 0;
            for (int i = 0; i < 4; i++) {
                while (true) {
                    int nx = tx + dx[topPurifierIdx[i]];
                    int ny = ty + dy[topPurifierIdx[i]];
                    if (nx < 0 || ny < 0 || nx >= r || ny >= c || nx > topIdx || room[nx][ny] == -1) break;
                    room[tx][ty] = room[tx][ty] == -1 ? -1 : room[nx][ny];
                    room[nx][ny] = 0;
                    tx = nx;
                    ty = ny;
                }
            }

            int bx = botIdx;
            int by = 0;
            for (int i = 0; i < 4; i++) {
                while (true) {
                    int nx = bx + dx[bottomPurifierIdx[i]];
                    int ny = by + dy[bottomPurifierIdx[i]];
                    if (nx < 0 || ny < 0 || nx >= r || ny >= c || nx < botIdx || room[nx][ny] == -1) break;
                    room[bx][by] = room[bx][by] == -1 ? -1 : room[nx][ny];
                    room[nx][ny] = 0;
                    bx = nx;
                    by = ny;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans += room[i][j];
            }
        }

        System.out.println(ans + 2);
    }
}
