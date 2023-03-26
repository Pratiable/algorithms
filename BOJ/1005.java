import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        Loop:
        for (int c = 0; c < t; c++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int[] times = new int[n + 1];
            int[] complete = new int[n + 1];
            int[] inDegree = new int[n + 1];

            for (int i = 1; i < n + 1; i++) {
                times[i] = Integer.parseInt(st.nextToken());
            }

            ArrayList<Integer>[] graph = new ArrayList[n + 1];

            for (int i = 0; i < n + 1; i++) {
                graph[i] = new ArrayList();
            }

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                graph[u].add(v);
                inDegree[v]++;
            }

            int w = Integer.parseInt(br.readLine());

            Queue<Integer> queue = new LinkedList<>();
            for (int i = 1; i < n + 1; i++) {
                if (inDegree[i] == 0) {
                    if (i == w) {
                        sb.append(times[i]).append("\n");
                        continue Loop;
                    }
                    queue.add(i);
                    complete[i] = times[i];
                }
            }

            while (!queue.isEmpty()) {
                int node = queue.poll();

                for (int i = 0; i < graph[node].size(); i++) {
                    int next = graph[node].get(i);

                    inDegree[next]--;
                    complete[next] = Math.max(complete[next], complete[node] + times[next]);
                    if (inDegree[next] == 0) {
                        queue.add(next);
                    }
                }
            }

            sb.append(complete[w]).append("\n");
        }
        System.out.println(sb);
    }
}