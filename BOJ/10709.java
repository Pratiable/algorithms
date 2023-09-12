import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        char[][] map = new char[h][w];
        int[][] times = new int[h][w];

        for (int i = 0; i < h; i++) {
            Arrays.fill(times[i], Integer.MIN_VALUE);
        }

        for (int i = 0; i < h; i++) {
            String str = br.readLine();
            for (int j = 0; j < w; j++) {
                char now = str.charAt(j);
                map[i][j] = now;
                if (now == 'c') times[i][j] = 0;
            }
        }

        int time = 1;

        while (true) {
            boolean isRemain = false;

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (map[i][j] == 'c') {
                        if (j + time >= w) continue;
                        isRemain = true;
                        if (times[i][j + time] != Integer.MIN_VALUE) continue;
                        times[i][j + time] = time;
                    }
                }
            }

            if (!isRemain) break;
            time++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                sb.append(times[i][j] == Integer.MIN_VALUE ? -1 : times[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}