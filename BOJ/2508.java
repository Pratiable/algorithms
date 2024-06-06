import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int t = 0 ; t < T ; t++) {
            br.readLine();
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            char[][] map = new char[r][c];
            int cnt = 0;

            for (int i = 0; i < r; i++) {
                String line = br.readLine();
                for (int j = 0; j < c; j++) {
                    map[i][j] = line.charAt(j);
                }
            }

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (map[i][j] == '>') {
                        if (j + 2 >= c) continue;
                        if (map[i][j + 1] == 'o' && map[i][j + 2] == '<') cnt++;
                    } else if (map[i][j] == 'v') {
                        if (i + 2 >= r) continue;
                        if (map[i + 1][j] == 'o' && map[i + 2][j] == '^') cnt++;
                    }
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}