import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[][] map = new String[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = st.nextToken();
            }
        }

        boolean isRow = true;
        int max = 0;
        int line = 0;

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < map[i][j].length(); k++) {
                    if (map[i][j].charAt(k) == '9') cnt++;
                }
            }

            if (cnt > max) {
                line = i;
                max = cnt;
            }
        }

        for (int i = 0; i < m; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < map[j][i].length(); k++) {
                    if (map[j][i].charAt(k) == '9') cnt++;
                }
            }

            if (cnt > max) {
                line = i;
                isRow = false;
                max = cnt;
            }
        }

        if (isRow) {
            for (int i = 0; i < m; i++) {
                map[line][i] = "";
            }
        } else {
            for (int i = 0; i < n; i++) {
                map[i][line] = "";
            }
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < map[i][j].length(); k++) {
                    if (map[i][j].charAt(k) == '9') sum++;
                }
            }
        }

        System.out.println(sum);
    }
}