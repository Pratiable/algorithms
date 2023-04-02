import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        int[] time = new int[n + 1];
        int[] inDegree = new int[n + 1];
        int[] result = new int[n + 1];

        ArrayList<Integer>[] graph = new ArrayList[n + 1];

        for (int i = 0; i < n + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 1; i < n + 1; i++) {
            st = new StringTokenizer(br.readLine());
            time[i] = Integer.parseInt(st.nextToken());

            while (st.hasMoreTokens()) {
                int next = Integer.parseInt(st.nextToken());
                if (next == -1) break;

                graph[next].add(i);
                inDegree[i]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i < n + 1; i++) {
            if (inDegree[i] == 0) {
                result[i] = time[i];
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int now = q.poll();

            for (int next: graph[now]) {
                result[next] = Math.max(result[now] + time[next], result[next]);
                if (--inDegree[next] == 0) {
                    q.add(next);
                }
            }
        }

        for (int i = 1; i < n + 1; i++) {
            sb.append(result[i]).append("\n");
        }

        System.out.println(sb);
    }
}