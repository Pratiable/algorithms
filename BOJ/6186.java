import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        char[][] map = new char[R][C];
        int cnt = 0;

        for (int i = 0; i < R; i++) {
            map[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (map[i][j] != '#') continue;

                boolean up = false;
                boolean left = false;

                if (i > 0) {
                    up = (map[i - 1][j] == '#');
                }

                if (j > 0) {
                    left = (map[i][j - 1] == '#');
                }

                if (!up && !left) cnt++;
            }
        }

        System.out.print(cnt);
    }
}
