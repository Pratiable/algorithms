import java.io.*;
import java.util.*;

class Main {
    static Node[] tree;
    static int n, max;
    static boolean[] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        max = Integer.MIN_VALUE;
        tree = new Node[n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < n + 1; i++) {
            tree[i] = new Node(Integer.MIN_VALUE, Integer.MIN_VALUE);
        }

        tree[1] = new Node(0, 0);
        tree[1].parent = 1;

        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            tree[a].lower.add(b);

            tree[b].parent = a;
            tree[b].distToParent = c;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i < n + 1; i++) {
            if (tree[i].lower.isEmpty()) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int now = q.poll();
            visited = new boolean[n + 1];
            visited[now] = true;
            f(now, 0);
        }

        System.out.println(max);
    }

    static void f(int cur, int dist) {
        int parent = tree[cur].parent;
        boolean moved = false;


        for (int next : tree[cur].lower) {
            if (visited[next]) continue;
            moved = true;
            visited[next] = true;
            f(next, dist + tree[next].distToParent);
        }

        if (!visited[parent]) {
            moved = true;
            visited[parent] = true;
            f(parent, dist + tree[cur].distToParent);
        }

        if (!moved) {
            max = Math.max(dist, max);
        }
    }

    static class Node {
        int parent, distToParent;
        ArrayList<Integer> lower = new ArrayList<>();

        public Node(int parent,  int distToParent) {
            this.parent = parent;
            this.distToParent = distToParent;
        }
    }
}