import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String directions = br.readLine();
        StringBuilder sb = new StringBuilder();
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1 ,0};
        boolean[][][] map = new boolean[n][n][2];
        int x = 0;
        int y = 0;
        int nx, ny;

        for (int i = 0; i < directions.length(); i++) {
            char direction = directions.charAt(i);
            switch (direction) {
                case 'D':
                    nx = x + dx[1];
                    ny = y + dy[1];
                    if (nx >= n || nx < 0 || ny >= n || ny < 0) break;
                    map[x][y][0] = true;
                    map[nx][ny][0] = true;
                    x = nx;
                    y = ny;
                    break;
                case 'U':
                    nx = x + dx[3];
                    ny = y + dy[3];
                    if (nx >= n || nx < 0 || ny >= n || ny < 0) break;
                    map[x][y][0] = true;
                    map[nx][ny][0] = true;
                    x = nx;
                    y = ny;
                    break;
                case 'R':
                    nx = x + dx[0];
                    ny = y + dy[0];
                    if (nx >= n || nx < 0 || ny >= n || ny < 0) break;
                    map[x][y][1] = true;
                    map[nx][ny][1] = true;
                    x = nx;
                    y = ny;
                    break;
                case 'L':
                    nx = x + dx[2];
                    ny = y + dy[2];
                    if (nx >= n || nx < 0 || ny >= n || ny < 0) break;
                    map[x][y][1] = true;
                    map[nx][ny][1] = true;
                    x = nx;
                    y = ny;
                    break;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j][0] && map[i][j][1]) {
                    sb.append("+");
                } else if (map[i][j][0]) {
                    sb.append("|");
                } else if (map[i][j][1]) {
                    sb.append("-");
                } else {
                    sb.append(".");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}