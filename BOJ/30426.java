import java.io.*;
import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] map = new int[k][2];

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            map[i] = new int[]{r, w};
        }

        boolean[] unstable = new boolean[n];
        boolean[][] visited = new boolean[k + 1][n];

        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            unstable[Integer.parseInt(br.readLine())] = true;
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{m, 0});
        visited[0][m] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int now = cur[0];
            int q = cur[1];

            if (now == 0 && q == k) {
                System.out.println("utopia");
                return;
            }
            if (q == k) continue;

            int right = (now + map[q][0]) % n;
            int wrong = (now + map[q][1]) % n;

            if (!unstable[right] && !visited[q + 1][right]) {
                visited[q + 1][right] = true;
                queue.add(new int[]{right, q + 1});
            }

            if (!unstable[wrong] && !visited[q + 1][wrong]) {
                visited[q + 1][wrong] = true;
                queue.add(new int[]{wrong, q + 1});
            }
        }

        System.out.println("dystopia");
    }
}
