import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] map = new char[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        int now = 1;
        for (int i = 0; i < m; i++) {
            boolean canEscape = true;
            for (int j = 0; j < n; j++) {
                if (map[j][i] == 'O') canEscape = false;
            }

            if (canEscape) {
                System.out.println(now);
                return;
            }

            now++;
        }

        System.out.println("ESCAPE FAILED");
    }
}
