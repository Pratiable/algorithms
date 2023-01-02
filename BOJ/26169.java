import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Queue<Data> queue = new LinkedList<>();
        int[][] map = new int[5][5];
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};
        boolean canDo = false;

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        int startX = Integer.parseInt(st.nextToken());
        int startY = Integer.parseInt(st.nextToken());

        queue.add(new Data(startX, startY, startX, startY, 0, 0));

        while(!queue.isEmpty()) {
            Data now = queue.poll();
            if (now.cnt > 3) {
                continue;
            }

            if (now.appleCnt >= 2) {
                canDo = true;
                break;
            }

            for (int c = 0; c < 4; c++) {
                int nextX = now.x + dx[c];
                int nextY = now.y + dy[c];

                if (nextX >= 5 || nextY >= 5 || nextX < 0 || nextY < 0) continue;
                if (map[nextX][nextY] == -1) continue;
                if (nextX == now.prevX && nextY == now.prevY) continue;

                queue.add(new Data(nextX, nextY, now.x, now.y, now.cnt + 1, now.appleCnt + map[nextX][nextY]));
            }
        }
        System.out.println(canDo ? 1 : 0);
    }
}

class Data {
    int x, y, prevX, prevY, cnt, appleCnt;

    Data(int nx, int ny, int px, int py, int count, int appleCount) {
        x = nx;
        y = ny;
        prevX = px;
        prevY = py;
        cnt = count;
        appleCnt = appleCount;
    }
}