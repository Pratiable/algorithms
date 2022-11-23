import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int first = 0;
        int second = 0;
        int min = 1000000;
        char[][] map = new char[n][m];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++){
                map[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                for (int k = i; k < i + 8; k++) {
                    for (int l = j; l < j + 8; l++) {
                        char target = ((k - i) + (l - j)) % 2 == 0 ? 'W' : 'B';
                        if (map[k][l] != target) first++;
                    }
                }

                for (int k = i; k < i + 8; k++) {
                    for (int l = j; l < j + 8; l++) {
                        char target = ((k - i) + (l - j)) % 2 == 0 ? 'B' : 'W';
                        if (map[k][l] != target) second++;
                    }
                }

                min = Math.min(min, Math.min(first, second));
                first = 0;
                second = 0;
            }
        }

        System.out.println(min);
    }
}