import java.io.*;
import java.util.*;

public class Main {
    static int[][] map;
    static boolean isDone;
    static int target;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        map = new int[9][9];
        isDone = false;
        target = 0;
        for (int i = 0; i < 9; i++) {
            String str = br.readLine();
            for (int j = 0; j < 9; j++) {
                int now = str.charAt(j) - '0';
                if (now == 0) target++;
                map[i][j] = now;
            }
        }

        make(0);
        System.out.println(sb);
    }

    static void make(int depth) {
        if (isDone) return;
        if (depth == target) {
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    sb.append(map[row][col]).append("");
                    if (col == 8) sb.append("\n");
                }
            }
            isDone = true;
            return;
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (map[i][j] != 0) continue;

                for (int k = 1; k < 10; k++) {
                    if (check(k, i, j)) {
                        map[i][j] = k;
                        make(depth + 1);
                        if (isDone) return;
                        map[i][j] = 0;
                    }
                }
                return;
            }
        }
    }

    static boolean check(int num, int x, int y) {
        for (int i = 0; i < 9; i++) {
            if (i != y) {
                if (map[x][i] == num) return false;
            }
            if (i != x) {
                if (map[i][y] == num) return false;
            }
        }
        for (int j = (x / 3) * 3; j < (((x / 3) + 1) * 3); j++) {
            for (int k = (y / 3) * 3; k < (((y / 3) + 1) * 3); k++) {
                if (x == j && y == k) continue;
                if (map[j][k] == num) return false;
            }
        }

        return true;
    }
}