import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int dx[] = {0, 1, 0, -1};
        int dy[] = {1, 0, -1, 0};
        int direction = 81;
        int n = Integer.parseInt(br.readLine());
        String moves = br.readLine();
        int x = 0, y = 0;
        int xMin = 0, xMax = 0, yMin = 0, yMax = 0;
        Queue<Coordination> q = new LinkedList<>();
        q.add(new Coordination(x, y));

        for (int i = 0; i < n; i++) {
            char move = moves.charAt(i);

            switch (move) {
                case 'F':
                    x += dx[direction % 4];
                    y += dy[direction % 4];
                    q.add(new Coordination(x, y));
                    break;
                case 'L':
                    direction--;
                    break;
                case 'R':
                    direction++;
                    break;
            }

            xMin = Math.min(xMin, x);
            xMax = Math.max(xMax, x);
            yMin = Math.min(yMin, y);
            yMax = Math.max(yMax, y);
        }

        int xLen = xMax - xMin + 1;
        int yLen = yMax - yMin + 1;
        boolean[][] map = new boolean[xLen][yLen];

        while (!q.isEmpty()) {
            Coordination c = q.poll();
            map[c.x - xMin][c.y - yMin] = true;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < xLen; i++) {
            for (int j = 0; j < yLen; j++) {
                sb.append(map[i][j] ? "." : "#");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    static class Coordination {
        int x;
        int y;
        Coordination(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}