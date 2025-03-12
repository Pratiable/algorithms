import java.io.*;
import java.util.*;

public class Main {
    static int n, maxBlack, maxWhite;
    static int[][] map;
    static boolean[] diagonal, rDiagonal;
    static ArrayList<Coordinate> blackCoord, whiteCoord;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        maxBlack = 0;
        maxWhite = 0;
        map = new int[n][n];
        blackCoord = new ArrayList<>();
        whiteCoord = new ArrayList<>();
        diagonal = new boolean[2 * n - 1];
        rDiagonal = new boolean[2 * n - 1];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    blackCoord.add(new Coordinate(i, j));
                } else {
                    whiteCoord.add(new Coordinate(i, j));
                }
            }
        }

        dfsBlack(0, 0);

        diagonal = new boolean[2 * n - 1];
        rDiagonal = new boolean[2 * n - 1];

        dfsWhite(0, 0);

        System.out.println(maxBlack + maxWhite);
    }
    
    static void dfsBlack(int idx, int cnt) {
        if (idx >= blackCoord.size()) {
            maxBlack = Math.max(maxBlack, cnt);
            return;
        }

        int x = blackCoord.get(idx).x;
        int y = blackCoord.get(idx).y;

        if (map[x][y] == 1 && isValid(x, y)) {
            diagonal[x + y] = true;
            rDiagonal[x - y + n - 1] = true;
            dfsBlack(idx + 1, cnt + 1);
            diagonal[x + y] = false;
            rDiagonal[x - y + n - 1] = false;
        }

        dfsBlack(idx + 1, cnt);
    }

    static void dfsWhite(int idx, int cnt) {
        if (idx >= whiteCoord.size()) {
            maxWhite = Math.max(maxWhite, cnt);
            return;
        }

        int x = whiteCoord.get(idx).x;
        int y = whiteCoord.get(idx).y;

        if (map[x][y] == 1 && isValid(x, y)) {
            diagonal[x + y] = true;
            rDiagonal[x - y + n - 1] = true;
            dfsWhite(idx + 1, cnt + 1);
            diagonal[x + y] = false;
            rDiagonal[x - y + n - 1] = false;
        }

        dfsWhite(idx + 1, cnt);
    }

    static boolean isValid(int x, int y) {
        return !(diagonal[x + y] || rDiagonal[x - y + n - 1]);
    }

    static class Coordinate {
        int x, y;
        Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
