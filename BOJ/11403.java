import java.io.*;
import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] graph = new int[n][n];
        boolean[][] visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
                visited[i][j] = false;
            }
        }

        for (int i = 0; i < n; i++) {
            boolean[] visitedRow = new boolean[n];

            Queue<Integer> q = new LinkedList<>();
            q.add(i);

            while (!q.isEmpty()) {
                int node = q.poll();
                for (int j = 0; j < n; j++) {
                    if (graph[node][j] == 0 || visitedRow[j]) continue;
                    visitedRow[j]= true;
                    q.add(j);
                }
            }

            for (int j = 0; j < n; j++) {
                if (visitedRow[j]) {
                    visited[i][j] = true;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(visited[i][j] ? 1 : 0).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
