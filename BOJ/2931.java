import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        boolean[] open = new boolean[4];
        String pipe;

        char[][] map = new char[R][C];

        for (int i = 0; i < R; i++) {
            String str = br.readLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (map[i][j] != '.') continue;
                boolean hasOpened = false;
                Arrays.fill(open, false);

                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx < 0 || ny < 0 || nx >= R || ny >= C || map[nx][ny] == '.' || map[nx][ny] == 'M' || map[nx][ny] == 'Z') continue;
                    char next = map[nx][ny];

                    if (k == 0 && (next == '-' || next == '+' || next == '3' || next == '4')) {
                        open[0] = true;
                    } else if (k == 1 && (next == '|' || next == '+' || next == '2' || next == '3')) {
                        open[1] = true;
                    } else if (k == 2 && (next == '-' || next == '+' || next == '1' || next == '2')) {
                        open[2] = true;
                    } else if (k == 3 && (next == '|' || next == '+' || next == '1' || next == '4')) {
                        open[3] = true;
                    } else {
                        continue;
                    }

                    hasOpened = true;
                }

                if (!hasOpened) continue;

                if (open[0] && open[1] && open[2] && open[3]) {
                    pipe = "+";
                } else if (open[0] && open[2]) {
                    pipe = "-";
                } else if (open[3] && open[1]) {
                    pipe = "|";
                } else if (open[0] && open[1]) {
                    pipe = "1";
                } else if (open[3] && open[0]) {
                    pipe = "2";
                } else if (open[2] && open[3]) {
                    pipe = "3";
                } else {
                    pipe = "4";
                }

                System.out.printf("%d %d %s", i + 1, j + 1, pipe);
                return;
            }
        }

    }
}