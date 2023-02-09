import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<Integer>[] graph = new ArrayList[N + 1];
        int[] semesters = new int[N + 1];
        int[] inDegree = new int[N + 1];

        for (int i = 0; i < N + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            inDegree[v]++;
        }

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 1; i < N + 1; i++) {
            if (inDegree[i] == 0) {
                queue.add(new int[]{i, 1});
            }
        }

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            semesters[now[0]] = now[1];

            for (int i = 0; i < graph[now[0]].size(); i++) {
                int next = graph[now[0]].get(i);

                if (--inDegree[next] == 0) {
                    queue.add(new int[]{next, now[1] + 1});
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < N + 1; i++) {
            sb.append(semesters[i]).append(" ");
        }

        System.out.println(sb);
    }
}
