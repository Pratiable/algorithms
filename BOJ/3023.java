import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        char[][] map = new char[x * 2][y * 2];

        for (int i = 0; i < x; i++) {
            String str = br.readLine();
            for (int j = 0; j < y; j++) {
                char now = str.charAt(j);
                map[i][j] = now;
                map[i][(y * 2) - 1 - j] = now;
            }
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y * 2; j++) {
                map[i + x][j] = map[(x - 1) - i][j];
            }
        }

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()) - 1;
        int b = Integer.parseInt(st.nextToken()) - 1;

        map[a][b] = map[a][b] == '#' ? '.' : '#';

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < x * 2; i++) {
            for (int j = 0; j < y * 2; j++) {
                sb.append(map[i][j]);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}