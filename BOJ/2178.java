import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Data> queue = new LinkedList<>();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int min = Integer.MAX_VALUE;
        boolean[][] map = new boolean[N][M];
        boolean[][] visited = new boolean[N][M];
        int dx[] = {0,1,0,-1};
        int dy[] = {1,0,-1,0};

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = str.charAt(j) == '1';
            }
        }

        queue.add(new Data(0, 0, 1));

        while(!queue.isEmpty()) {
            Data now = queue.poll();
            if (now.x == N - 1 && now.y == M - 1) {
                min = Math.min(min, now.cnt);
            }

            for (int j = 0; j < 4; j++) {
                int nextX = now.x + dx[j];
                int nextY = now.y + dy[j];

                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) continue;
                if (!map[nextX][nextY] || visited[nextX][nextY]) continue;
                visited[nextX][nextY] = true;
                queue.add(new Data(nextX, nextY, now.cnt + 1));
            }
        }

        System.out.println(min);
    }
}

class Data {
    int x, y, cnt;

    public Data(int nextX, int nextY, int count) {
        x = nextX;
        y = nextY;
        cnt = count;
    }
}