import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int x = 0; x < N; x++) {
            for (int r = 0; r < K; r++) {
                for (int y = 0; y < N; y++) {
                    for (int c = 0; c < K; c++) {
                        sb.append(map[x][y]).append(" ");
                    }
                }
                sb.append("\n");
            }
        }

        System.out.print(sb);
    }
}
