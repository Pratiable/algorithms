import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =  new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st =  new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        List<Integer>[] tps = new List[n + 1];
        int[] moves = new int[n + 1];
        Arrays.fill(moves, Integer.MAX_VALUE);
        for (int i = 0; i < n + 1; i++) {
            tps[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            tps[x].add(y);
            tps[y].add(x);
        }

        Queue<Move> q = new LinkedList<>();
        q.add(new Move(s, 0));

        while (!q.isEmpty()) {
            Move now = q.poll();
            if (now.to == e) {
                moves[now.to] = Math.min(moves[now.to], now.cnt);
                continue;
            }

            if (now.to > 1 && moves[now.to - 1] > now.cnt + 1) {
                moves[now.to - 1] = now.cnt + 1;
                q.add(new Move(now.to - 1, now.cnt + 1));
            }

            if (now.to < n && moves[now.to + 1] > now.cnt + 1) {
                moves[now.to + 1] = now.cnt + 1;
                q.add(new Move(now.to + 1, now.cnt + 1));
            }

            for (int i = 0; i < tps[now.to].size(); i++) {
                int to = tps[now.to].get(i);
                if (moves[to] <= now.cnt + 1) continue;
                moves[to] = now.cnt + 1;
                q.add(new Move(to, now.cnt + 1));
            }
        }

        System.out.println(moves[e]);
    }

    static class Move {
        int to, cnt;

        public Move(int to, int cnt) {
            this.to = to;
            this.cnt = cnt;
        }
    }
}
