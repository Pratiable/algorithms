import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int NR = Integer.parseInt(st.nextToken());
        int NC = Integer.parseInt(st.nextToken());
        int[][] map = new int[NR][NC];
        int max = -1;
        int maxR = 0;
        int maxC = 0;

        for (int i = 0; i < NR; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < NC; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i <= NR - 3; i++) {
            for (int j = 0; j <= NC - 3; j++) {
                int sum = 0;
                
                for (int r = i; r < i + 3; r++) {
                    for (int c = j; c < j + 3; c++) {
                        sum += map[r][c];
                    }
                }

                if (sum > max) {
                    max = sum;
                    maxR = i + 1;
                    maxC = j + 1;
                }
            }
        }

        sb.append(max).append("\n").append(maxR).append(" ").append(maxC);

        System.out.print(sb);
    }
}
