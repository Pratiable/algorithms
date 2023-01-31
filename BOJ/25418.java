import java.io.*;
import java.util.*;

public class Main {
    static int a, k, min;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        min = Integer.MAX_VALUE;
        boolean[] visited = new boolean[1000001];

        Queue<Make> queue = new LinkedList<>();
        queue.add(new Make(a, 0));
        while (!queue.isEmpty()) {
            Make now = queue.poll();
            if (now.num == k) {
                min = Math.min(now.cnt, min);
                continue;
            }
            if (now.num > k) continue;
            if (visited[now.num]) continue;
            visited[now.num] = true;

            queue.add(new Make(now.num + 1, now.cnt + 1));
            queue.add(new Make(now.num * 2, now.cnt + 1));
        }

        System.out.println(min);
    }

    static class Make {
        int num, cnt;

        Make(int num, int cnt) {
            this.num = num;
            this.cnt = cnt;
        }
    }
}