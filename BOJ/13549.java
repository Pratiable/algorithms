import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int min = Integer.MAX_VALUE;

        if (n >= k) {
            System.out.println(n - k);
            return;
        }

        int[] map = new int[100_001];
        Arrays.fill(map, Integer.MAX_VALUE);

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{n, 0});

        while (!queue.isEmpty()) {
            int[] now = queue.poll();

            if (now[0] == k) {
                min = Math.min(min, now[1]);
                continue;
            }

            if (now[0] < 100_000 && now[1] + 1 < map[now[0] + 1]) {
                map[now[0] + 1] = now[1] + 1;
                queue.add(new int[]{now[0] + 1, now[1] + 1});
            }

            if (now[0] > 0 && now[1] + 1 < map[now[0] - 1]) {
                map[now[0] - 1] = now[1] + 1;
                queue.add(new int[]{now[0] - 1, now[1] + 1});
            }

            if (now[0] <= 50_000 && now[1] < map[now[0] * 2]) {
                map[now[0] * 2] = now[1];
                queue.add(new int[]{now[0] * 2, now[1]});
            }
        }

        System.out.println(min);
    }
}
