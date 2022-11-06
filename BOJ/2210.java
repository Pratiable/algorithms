import java.io.*;
import java.util.*;

public class Main {
    public static HashSet<String> set = new HashSet<>();
    public static StringBuilder sb = new StringBuilder();
    public static String[][] map = new String[5][5];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                map[j][i] = st.nextToken();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                make("", 0, i, j);
            }
        }

        System.out.println(set.size());
    }

    public static void make(String str, int count, int x, int y) {
        if (count == 6) {
            set.add(str);
            return;
        }

        if (x > 0) make(str + map[y][x], count + 1, x - 1, y);
        if (y > 0) make(str + map[y][x], count + 1, x, y - 1);
        if (x < 4) make(str + map[y][x], count + 1, x + 1, y);
        if (y < 4) make(str + map[y][x], count + 1, x, y + 1);
    }
}