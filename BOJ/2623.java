import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] inDegree = new int[N + 1];

        graph = new ArrayList[N + 1];

        for (int i = 0; i < N + 1; i++) {
            graph[i] = new ArrayList();
        }

        for (int i = 0; i < M; i++) {
            String[] nums = br.readLine().split(" ");
            for (int j = 1; j < nums.length - 1; j++) {
                int u = Integer.parseInt(nums[j]);
                int v = Integer.parseInt(nums[j + 1]);
                graph[u].add(v);
                inDegree[v]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        int vCount = 0;
        for (int i = 1; i < N + 1; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
                vCount++;
            }
        }

        while (!queue.isEmpty()) {
            int node = queue.poll();

            sb.append(node).append("\n");

            for (int i = 0; i < graph[node].size(); i++) {
                int next = graph[node].get(i);

                inDegree[next]--;
                if (inDegree[next] == 0) {
                    queue.add(next);
                    vCount++;
                }
            }
        }

        if (vCount != N) {
            System.out.println(0);
            return;
        }

        System.out.println(sb);
    }
}