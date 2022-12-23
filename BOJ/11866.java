import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i < N + 1; i++) {
            queue.offer(i);
        }

        sb.append("<");

        while (queue.size() > 1) {
            for (int j = 0; j < K - 1; j++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll()).append(", ");
        }
        
        sb.append(queue.poll()).append(">");

        System.out.println(sb);
    }
}