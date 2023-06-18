import java.io.*;
import java.util.*;

public class Main {
    static int n, m, w;
    static long INF;
//    static ArrayList<Map<Integer, Integer>> roads;
    static ArrayList<ArrayList<Node>> roads;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        INF = 100_000_000_000_000L;

        Loop:
        for (int tc = 0; tc < t; tc++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());

//            roads = new ArrayList<>(n + 1);
//            for (int i = 0; i < n + 1; i++) {
//                roads.add(i, new HashMap<>());
//            }

            long[][] map = new long[n + 1][n + 1];
//            roads = new ArrayList[n + 1];

            roads = new ArrayList<>();
            for (int i = 0; i < n + 1; i++) {
                roads.add(new ArrayList<>());
                Arrays.fill(map[i], INF);
            }

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int S = Integer.parseInt(st.nextToken());
                int E = Integer.parseInt(st.nextToken());
                int T = Integer.parseInt(st.nextToken());

                if (map[S][E] > T && map[E][S] > T) {
                    map[S][E] = T;
                    map[E][S] = T;
                    roads.get(S).add(new Node(E, T));
                    roads.get(E).add(new Node(S, T));
                }
            }
            for (int i = 0; i < w; i++) {
                st = new StringTokenizer(br.readLine());
                int S = Integer.parseInt(st.nextToken());
                int E = Integer.parseInt(st.nextToken());
                int T = Integer.parseInt(st.nextToken());

                if (map[S][E] > -T) {
                    map[S][E] = -T;
                    roads.get(S).add(new Node(E, -T));
                }
            }

            for (int i = 1; i < n + 1; i++) {
                if (bf(i)) {
                    sb.append("YES\n");
                    continue Loop;
                }
            }
            sb.append("NO\n");
        }
        System.out.println(sb);
    }

    static boolean bf(int node) {
        long[] dist = new long[n + 1];
        Arrays.fill(dist, INF);
        dist[node] = 0;
        boolean isDecreasing = false;

        for (int i = 1; i < n; i++) {
            isDecreasing = false;
            for (int j = 1; j < n + 1; j++) {
                for (Node now : roads.get(j)) {
                    if (dist[j] == INF) continue;
                    if (dist[now.end] > dist[j] + now.time) {
                        isDecreasing = true;
                        dist[now.end] = dist[j] + now.time;
                    }
                }
            }
            if (!isDecreasing) break;
        }

        if (isDecreasing) {
            for (int j = 1; j < n + 1; j++) {
                for (Node now : roads.get(j)) {
                    if (dist[j] == INF) continue;
                    if (dist[now.end] > dist[j] + now.time) {
                        return isDecreasing;
                    }
                }
            }
        }


        return false;
    }

    static class Node {
        int end, time;

        public Node(int end, int time) {
            this.end = end;
            this.time = time;
        }
    }
}