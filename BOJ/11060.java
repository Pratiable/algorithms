import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] maze = new int[n];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            maze[i] = Integer.parseInt(st.nextToken());
        }
        int min = Integer.MAX_VALUE;

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            if (now[0] == n - 1) {
                min = Math.min(now[1], min);
                continue;
            }
            if (now[0] > n - 1) continue;
            if (visited[now[0]]) continue;
            visited[now[0]] = true;

            for (int i = 1; i <= maze[now[0]]; i++) {
                queue.add(new int[]{now[0] + i, now[1] + 1});
            }
        }

        System.out.println(min == Integer.MAX_VALUE ? -1 : min);
    }
}