import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        Loop:
        for (int t = 0; t < T; t++) {
            char[][] map = new char[3][3];
            for (int i = 0; i < 3; i++) {
                String str = br.readLine();
                for (int j = 0; j < 3; j++) {
                    map[i][j] = str.charAt(j);
                }
            }
            char target = br.readLine().charAt(0);

            for (int i = 0; i < 3; i++) {
                int targetCnt = 0;
                int blankX = -1;
                int blankY = -1;
                for (int j = 0; j < 3; j++) {
                    if (map[i][j] == target) targetCnt++;
                    else if (map[i][j] == '-') {
                        blankX = i;
                        blankY = j;
                    }
                }

                if (targetCnt == 2 && blankX != -1) {
                    map[blankX][blankY] = target;
                    createCase(t + 1, map);
                    continue Loop;
                }
            }

            for (int i = 0; i < 3; i++) {
                int targetCnt = 0;
                int blankX = -1;
                int blankY = -1;
                for (int j = 0; j < 3; j++) {
                    if (map[j][i] == target) targetCnt++;
                    else if (map[j][i] == '-') {
                        blankX = j;
                        blankY = i;
                    }
                }

                if (targetCnt == 2 && blankX != -1) {
                    map[blankX][blankY] = target;
                    createCase(t + 1, map);
                    continue Loop;
                }
            }

            int targetCnt = 0;
            int blankX = -1;
            int blankY = -1;

            for (int i = 0; i < 3; i++) {
                if (map[i][i] == target) targetCnt++;
                else if (map[i][i] == '-') {
                        blankX = i;
                        blankY = i;
                }
            }

            if (targetCnt == 2 && blankX != -1) {
                map[blankX][blankY] = target;
                createCase(t + 1, map);
                continue Loop;
            }

            targetCnt = 0;
            blankX = -1;
            blankY = -1;
            int sx = 2;
            int sy = 0;

            for (int i = 0; i < 3; i++) {
                char now = map[sx--][sy++];
                if (now == target) targetCnt++;
                else if (now == '-') {
                    blankX = sx + 1;
                    blankY = sy - 1;
                }
            }

            if (targetCnt == 2 && blankX != -1) {
                map[blankX][blankY] = target;
                createCase(t + 1, map);
            }
        }

        System.out.println(sb);
    }

    static void createCase(int caseNum, char[][] map) {
        sb.append("Case ").append(caseNum).append(": \n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sb.append(map[i][j]);
            }
            sb.append("\n");
        }
    }
}