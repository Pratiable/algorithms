import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            int now = Integer.parseInt(br.readLine());

            if (now == 0 && pq.isEmpty()) {
                sb.append(0).append("\n");
            } else if (now == 0) {
                sb.append(pq.poll()).append("\n");
            } else {
                pq.offer(now);
            }
        }

        System.out.println(sb);
    }
}