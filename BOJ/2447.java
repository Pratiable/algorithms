import java.io.*;

public class Main {
    static boolean[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        map = new boolean[n][n];

        f(0, 0, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(map[i][j] ? '*' : ' ');
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    static void f(int x, int y, int n) {
        if (n == 1) {
            map[x][y] = true;
            return;
        }

        int next = n / 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) continue;
                f(i * next + x, j * next + y, next);
            }
        }
    }
}