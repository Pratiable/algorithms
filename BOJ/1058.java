import java.io.*;
import java.util.*;

public class Main {
    static int max, N;
    static boolean[] visited;
    static boolean[][] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        max = Integer.MIN_VALUE;
        N = Integer.parseInt(br.readLine());

        graph = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                if (str.charAt(j) == 'Y') {
                    graph[i][j] = true;
                }
            }
        }

        for (int k = 0; k < N; k++) {
            Queue<Data> queue = new LinkedList<>();
            visited = new boolean[N];
            queue.add(new Data(k, 0));
            visited[k] = true;
            int cnt = 0;

            while (!queue.isEmpty()) {
                Data now = queue.poll();

                if (now.depth >= 2) continue;

                for (int i = 0; i < N; i++) {
                    if (!graph[now.node][i] || visited[i]) continue;
                    visited[i] = true;
                    cnt++;
                    queue.add(new Data(i, now.depth + 1));
                }
            }

            max = Math.max(max, cnt);
        }

        System.out.println(max);
    }

    static class Data {
        int node, depth;

        Data (int node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }
}