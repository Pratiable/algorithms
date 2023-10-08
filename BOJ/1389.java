import java.io.*;
import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int min = Integer.MAX_VALUE;
        int target = 0;

        ArrayList<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 0; i < n + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        for (int i = 1; i < n + 1; i++) {
            Queue<Person> q = new LinkedList<>();
            boolean[] visited = new boolean[n + 1];
            int kb = 0;
            q.add(new Person(i, 0));
            visited[i] = true;

            while (!q.isEmpty()) {
                Person now = q.poll();

                for (int next: graph[now.num]) {
                    if (!visited[next]) {
                        visited[next] = true;
                        kb += now.dist + 1;
                        q.add(new Person(next, now.dist + 1));
                    }
                }
            }

            if (min > kb) {
                min = kb;
                target = i;
            }
        }

        System.out.println(target);
    }

    static class Person {
        int num;
        int dist;
        Person(int num, int dist) {
            this.num = num;
            this.dist = dist;
        }
    }
}
