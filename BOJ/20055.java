import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int steps = 0;
        int[] map = new int[n * 2];
        Queue<Integer> robots = new LinkedList<>();
        boolean[] stacked = new boolean[n * 2];
        int start = 0;
        int end = n - 1;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n * 2; i++) {
            map[i] = Integer.parseInt(st.nextToken());
        }

        while (true) {
            steps++;
            start = start - 1 < 0 ? n * 2 - 1 : start - 1;
            end = end - 1 < 0 ? n * 2 - 1 : end - 1;
            int stackedRobots = robots.size();
            for (int i = 0; i < stackedRobots; i++) {
                int now = robots.poll();
                int next = now + 1 >= n * 2 ? 0 : now + 1;
                if (now == end) {
                    stacked[now] = false;
                    continue;
                }

                if (map[next] != 0 && !stacked[next]) {
                    map[next]--;
                    stacked[now] = false;
                    if (next == end) continue;
                    stacked[next] = true;
                    robots.add(next);
                } else {
                    robots.add(now);
                }

            }

            if (map[start] != 0) {
                robots.add(start);
                stacked[start] = true;
                map[start]--;
            }

            int breakCnt = 0;
            for (int j : map) {
                if (j == 0) breakCnt++;
            }

            if (breakCnt >= k) break;


        }

        System.out.println(steps);
    }
}
