import java.io.*;
import java.util.*;

public class Main {
    public static int[][] map;
    public static boolean can = false;
    public static int n;
    public static int[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[j][i] = Integer.parseInt(st.nextToken());
            }
        }

        move(0, 0);

        System.out.println(can ? "HaruHaru" : "Hing");
    }

    public static void move(int x, int y) {
        if (x >= n || y >= n) return;
        if (visited[y][x] == 1) return;
        if (x == n - 1 && y == n - 1) {
            can = true;
        }
        if (can) return;
        visited[y][x] = 1;
        if (x < n - 1) move(x + map[y][x], y);
        if (y < n - 1) move(x, y + map[y][x]);
    }
}