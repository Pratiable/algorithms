import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int min = Integer.MAX_VALUE;
        boolean[] visited = new boolean[100001];
        Queue<MoveData> queue = new LinkedList<>();

        queue.add(new MoveData(N, 0));

        while (!queue.isEmpty()) {
            MoveData now = queue.poll();
            
            if (now.cnt >= min) continue;

            if (now.idx == K) {
                min = Math.min(min, now.cnt);
                continue;
            }

            if (visited[now.idx]) continue;
            visited[now.idx] = true;
            if (now.idx - 1 >= 0) queue.add(new MoveData(now.idx - 1, now.cnt + 1));
            if (now.idx + 1 <= 100000) queue.add(new MoveData(now.idx + 1, now.cnt + 1));
            if (now.idx * 2 <= 100000) queue.add(new MoveData(now.idx * 2, now.cnt + 1));
        }

        System.out.println(min);
    }
}

class MoveData {
    int idx, cnt;

    MoveData(int index, int count) {
        idx = index;
        cnt = count;
    }
}