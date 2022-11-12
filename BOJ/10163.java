import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int[][] map = new int[1001][1001];
        int n = Integer.parseInt(br.readLine());
        int now = 1;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int width = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            for (int j = x; j < x + width; j++) {
                for (int k = y; k < y + height; k++) {
                    map[j][k] = now;
                }
            }
            now++;
        }

        for (int l = 1; l <= n; l++) {
            int count = 0;
            for (int r = 0; r < map.length; r++) {
                for (int c = 0; c < map.length; c++) {
                    if (map[r][c] == l) count++;
                }
            }
            bw.append(String.valueOf(count)).append("\n");
        }


        bw.flush();
        bw.close();
    }
}