import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] people = new int[n];
        boolean[] visited = new boolean[n];
        int min = -1;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            people[i] = Integer.parseInt(br.readLine());
        }

        Queue<Integer> queue = new LinkedList<>();
        visited[0] = true;
        queue.add(0);
        while (!queue.isEmpty()) {
            int now = queue.poll();
            if (now == k) {
                min = cnt;
                continue;
            }

            int next = people[now];
            if (visited[next]) continue;
            visited[next] = true;
            cnt++;
            queue.add(next);
        }

        System.out.println(min);
    }
}