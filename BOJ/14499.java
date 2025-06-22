import java.io.*;
import java.util.*;

public class Main {
    static int[][] map;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        map = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] cmds = new int[k];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) {
            cmds[i] = Integer.parseInt(st.nextToken());
        }

        Dice dice = new Dice();

        for (int cmd : cmds) {
            cmd--;
            int nx = x + dx[cmd];
            int ny = y + dy[cmd];
            if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
            switch (cmd) {
                case 0:
                    dice.moveRight();
                    break;
                case 1:
                    dice.moveLeft();
                    break;
                case 2:
                    dice.moveForward();
                    break;
                case 3:
                    dice.moveBackward();
                    break;
            }

            if (map[nx][ny] == 0) {
                map[nx][ny] = dice.bottom;
            } else {
                dice.bottom = map[nx][ny];
                map[nx][ny] = 0;
            }

            sb.append(dice.top).append("\n");
            x = nx;
            y = ny;
        }

        System.out.println(sb);
    }

    static class Dice {
        int top, bottom, front, rear, left, right;

        public Dice() {
            top = 0;
            bottom = 0;
            front = 0;
            rear = 0;
            left = 0;
            right = 0;
        }

        void moveForward() {
            int tmp = front;
            front = top;
            top = rear;
            rear = bottom;
            bottom = tmp;
        }

        void moveBackward() {
            int tmp = top;
            top = front;
            front = bottom;
            bottom = rear;
            rear = tmp;
        }

        void moveLeft() {
            int tmp = left;
            left = top;
            top = right;
            right = bottom;
            bottom = tmp;
        }

        void moveRight() {
            int tmp = right;
            right = top;
            top = left;
            left = bottom;
            bottom = tmp;
        }
    }
}