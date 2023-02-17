import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        
        ArrayList<Integer>[] graph = new ArrayList[N + 1];
        int[] times = new int[N + 1];
        int[] inDegree = new int[N + 1];
        int[] maxs = new int[N + 1];
        int min = 0;

        for (int i = 0; i < N + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 1; i < N + 1; i++) {
            st = new StringTokenizer(br.readLine());
            times[i] = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());
            for (int j = 0; j < count; j++) {
            	int u = Integer.parseInt(st.nextToken());
                graph[u].add(i);
                inDegree[i]++;
            }
        }
        
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 1; i < N + 1; i++) {
            if (inDegree[i] == 0) {
                queue.add(new int[]{i, times[i]});
            }
        }

        while (!queue.isEmpty()) {
            int[] now = queue.poll();

            if (graph[now[0]].size() == 0) {
                min = Math.max(min, now[1]);
                continue;
            }
            
            for (int i = 0; i < graph[now[0]].size(); i++) {
                int next = graph[now[0]].get(i);
                inDegree[next]--;
                maxs[next] = Math.max(maxs[next], now[1]);
                
                if (inDegree[next] == 0) {
                    queue.add(new int[]{next, maxs[next] + times[next]});
                }
            }
        }

        System.out.println(min);
    }
}
