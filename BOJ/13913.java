import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        StringBuilder move = new StringBuilder();
        int min = Integer.MAX_VALUE;
        boolean[] map = new boolean[100_001];

        if (n > k) {
            System.out.println(n - k);
            while(n >= k) {
                move.append(n).append(" ");
                n--;
            }
            System.out.println(move);
            return;
        }

        Queue<Data> queue = new LinkedList<>();

        queue.add(new Data(n, 0, new StringBuilder().append(n).append(" ")));

        while (!queue.isEmpty()) {
            Data now = queue.poll();

            if (now.node == k) {
                min = Math.min(min, now.cnt);
                move = now.sb;
                break;
            }

            if (now.cnt + 1 > min) continue;

            if (now.node > 0 && !map[now.node - 1]) {
                map[now.node - 1] = true;
                queue.add(new Data(now.node - 1, now.cnt + 1, new StringBuilder(now.sb).append(now.node - 1). append(" ")));
            }

            if (now.node < 100_000 && !map[now.node + 1]) {
                map[now.node + 1] = true;
                queue.add(new Data(now.node + 1, now.cnt + 1, new StringBuilder(now.sb).append(now.node + 1). append(" ")));
            }

            if (now.node < 50_001 && !map[now.node * 2]) {
                map[now.node * 2] = true;
                queue.add(new Data(now.node * 2, now.cnt + 1, new StringBuilder(now.sb).append(now.node * 2). append(" ")));
            }
        }

        System.out.println(min);
        System.out.println(move);
    }

    static class Data {
        int node, cnt;
        StringBuilder sb;

        Data(int node, int cnt, StringBuilder sb) {
            this.node = node;
            this.cnt = cnt;
            this.sb = sb;
        }
    }
}
