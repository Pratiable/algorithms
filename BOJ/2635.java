import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Queue<Integer> mq = new LinkedList<>();

        for (int i = n; i > 0; i--) {
            Deque<Integer> queue = new LinkedList<>();
            queue.add(n);
            queue.add(i);
            int p = i;
            int pp = n;
            while (true) {
                if (pp - p < 0) break;
                queue.add(pp - p);
                pp = p;
                p = queue.peekLast();
            }

            if (queue.size() > mq.size()) {
                mq.clear();
                while (!queue.isEmpty()) {
                    mq.add(queue.poll());
                }
            }
        }

        sb.append(mq.size()).append("\n");
        while (!mq.isEmpty()) {
            sb.append(mq.poll()).append(" ");
        }


        System.out.println(sb);
    }
}
