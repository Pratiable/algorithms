import java.io.*;
import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static int r;
    public static int c;
    public static int max;
    public static char[][] map;
    public static boolean[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        map = new char[r][c];
        max = 1;
        check = new boolean[27];
        for (int i = 0; i < r; i++) {
            String str = br.readLine();
            for (int j = 0; j < c; j++) {
                map[i][j] = str.charAt(j);
            }
        }
        move(0, 0, 0);
        System.out.println(max);
    }

    public static void move(int x, int y, int count) {
        if (check[map[y][x] - 'A']) {
            max = Math.max(max, count);
            return;
        }

        check[map[y][x] - 'A'] = true;
        if (x < c - 1) move(x + 1, y, count + 1);
        if (y < r - 1) move(x, y + 1, count + 1);
        if (x > 0) move(x - 1, y, count + 1);
        if (y > 0) move(x, y - 1, count + 1);
        check[map[y][x] - 'A'] = false;
    }
}