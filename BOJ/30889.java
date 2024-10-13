import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        char[][] map = new char[10][20];

        for (int i = 0; i < 10; i++) {
            Arrays.fill(map[i], '.');
        }

        for (int i = 0; i < n; i++) {
            String target = br.readLine();
            int x = target.charAt(0) - 'A';
            int y = Integer.parseInt(target.substring(1));
            map[x][y - 1] = 'o';
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                sb.append(map[i][j]);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
