import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int F = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int U = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int min = Integer.MAX_VALUE;

        boolean[] visited = new boolean[F + 1];

        Queue<Data> queue = new LinkedList<>();
        visited[S] = true;
        queue.add(new Data(S, 0));

        while (!queue.isEmpty()) {
            Data now = queue.poll();

            if (now.pos == G) {
                min = Math.min(min, now.count);
                continue;
            }
            
            if (now.pos + U <= F && !visited[now.pos + U]) {
                visited[now.pos + U] = true;
                queue.add(new Data(now.pos + U, now.count + 1));
            }

            if (now.pos - D > 0 && !visited[now.pos - D]) {
                visited[now.pos - D] = true;
                queue.add(new Data(now.pos - D, now.count + 1));
            }
        }

        System.out.println(min == Integer.MAX_VALUE ? "use the stairs" : min);
    }

    static class Data {
        int pos, count;

        Data(int pos, int count) {
            this.pos = pos;
            this.count = count;
        }
    }
}