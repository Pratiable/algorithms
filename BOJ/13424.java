//Floyd
import java.io.*;
import java.util.*;

public class Main {
    static int[][] graph;
    static int n, m;
    static int[] sum;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            sum = new int[n + 1];
            graph = new int[n + 1][n + 1];

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    graph[i][j] = i == j ? 0 : 1_000_000;
                }
            }

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());

                graph[a][b] = c;
                graph[b][a] = c;
            }

            int k = Integer.parseInt(br.readLine());

            int[] ppl = new int[k];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < k; i++) {
                ppl[i] = Integer.parseInt(st.nextToken());
            }

            for (int l = 1; l < n + 1; l++) {
                for (int i = 1; i < n + 1; i++) {
                    for (int j = 1; j < n + 1; j++) {
                        graph[i][j] = Math.min(graph[i][j], graph[i][l] + graph[l][j]);
                    }
                }
            }

            for (int person: ppl) {
                for (int i = 1; i < n + 1; i++) {
                    if (graph[person][i] == 1_000_000) continue;
                    sum[i] += graph[person][i];
                }
            }

            int min = Integer.MAX_VALUE;
            int minVertex = -1;

            for (int i = 1; i <= n; i++) {
                if (min > sum[i]) {
                    min = sum[i];
                    minVertex = i;
                }
            }

            sb.append(minVertex).append("\n");
        }

        System.out.println(sb);
    }
}
