import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int[] depths, parents;
    static ArrayList<Integer>[] tree;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        tree = new ArrayList[n + 1];

        for (int i = 0; i < n + 1; i++) {
            tree[i] = new ArrayList<>();
        }

        parents = new int[n + 1];
        depths = new int[n + 1];
        Arrays.fill(depths,Integer.MIN_VALUE);

        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            tree[a].add(b);
            tree[b].add(a);
        }

        dfs(1, 1, 0);

        StringBuilder sb = new StringBuilder();
        m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(lca(a, b)).append("\n");
        }

        System.out.println(sb);
    }

    public static int lca(int a, int b){
        while (depths[a] != depths[b]) {
            if (depths[a] > depths[b]) {
                a = parents[a];
                continue;
            }
            b = parents[b];
        }

        while (true) {
            if (a == b) return a;
            a = parents[a];
            b = parents[b];
        }
    }

    public static void dfs(int cur, int depth, int parent){
        depths[cur] = depth;
        parents[cur] = parent;
        for (int next: tree[cur]){
            if (next == parent) continue;
            dfs(next, depth + 1,cur);
        }
    }
}
