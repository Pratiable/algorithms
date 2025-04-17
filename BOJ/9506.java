import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;
            queue.clear();
            int sum = 0;
            for (int i = 1; i <= n / 2; i++) {
                if (n % i != 0) continue;
                queue.add(i);
                sum += i;
            }

            if (sum != n) {
                sb.append(n).append(" is NOT perfect.\n");
                continue;
            }

            sb.append(n).append(" = ").append(queue.poll());
            while (!queue.isEmpty()) {
                sb.append(" + ").append(queue.poll());
            }w
            sb.append("\n");
        }

        System.out.println(sb);
    }
}