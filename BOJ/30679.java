import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] A;
    static int[][] visited;

    static final int[] arrY = { -1, 0, 1, 0 };
    static final int[] arrX = { 0, 1, 0, -1 };

    static boolean Cango(int y, int x) {
        return y >= 1 && x >= 1 && y <= N && x <= M;
    }

    static boolean go(int sy, int sx) {
        Queue<QueueData> q = new LinkedList<>();
        q.add(new QueueData(sy, sx, 1));
        visited[sy][sx] |= (1 << 1);

        while (!q.isEmpty()) {
            QueueData now = q.poll();

            int cnt = A[now.y][now.x];

            int dy = now.y + (arrY[now.way] * cnt);
            int dx = now.x + (arrX[now.way] * cnt);
            int dway = (now.way + 1) % 4;

            if (Cango(dy, dx)) {
                if ((visited[dy][dx] & (1 << dway)) != 0)
                    return true;

                visited[dy][dx] |= (1 << dway);
                q.add(new QueueData(dy, dx, dway));
            } else {
                return false;
            }
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[N + 1][M + 1];
        visited = new int[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= M; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        List<Integer> canConfine = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            for (int[] row : visited) {
                Arrays.fill(row, 0);
            }
            if (go(i, 1)) {
                canConfine.add(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(canConfine.size()).append("\n");
        for (int num : canConfine) {
            sb.append(num).append(" ");
        }
        sb.append("\n");

        System.out.print(sb);
    }

    static class QueueData {
        int y, x, way;

        public QueueData(int y, int x, int way) {
            this.y = y;
            this.x = x;
            this.way = way;
        }
    }
}
