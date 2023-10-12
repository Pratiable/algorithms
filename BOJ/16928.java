import java.io.*;
import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] map = new int[101];
        boolean[] visited = new boolean[101];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map[a] = b;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map[a] = b;
        }

        Queue<Move> queue = new LinkedList<>();
        for (int i = 2; i <= 7; i++) {
            visited[i] = true;
            if (map[i] != 0) {
                visited[map[i]] = true;
                queue.add(new Move(map[i], 1));
                continue;
            }
            queue.add(new Move(i, 1));
        }

        while (!queue.isEmpty()) {
            Move now = queue.poll();
            if (now.now >= 94) {
                min = Math.min(now.cnt + 1, min);
                continue;
            }
            if (now.cnt + 1 >= min) continue;

            for (int i = 1; i <= 6; i++) {
                int nx = now.now + i;
                if (visited[nx]) continue;
                if (visited[map[nx]]) continue;
                visited[nx] = true;
                if (map[nx] != 0 && !visited[map[nx]]) {
                    int nnx = map[nx];
                    while (true) {
                        if (map[nnx] != 0 && !visited[map[nnx]]) {
                            visited[map[nnx]] = true;
                            nnx = map[nnx];
                            continue;
                        }
                        break;
                    }
                    queue.add(new Move(nnx, now.cnt + 1));
                    continue;
                }
                queue.add(new Move(nx, now.cnt + 1));
            }
        }

        System.out.println(min);
    }

    static class Move {
        int now, cnt;

        public Move(int now, int cnt) {
            this.now = now;
            this.cnt = cnt;
        }
    }
}
