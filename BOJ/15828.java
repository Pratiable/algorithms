import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        while (true) {
            int cur = Integer.parseInt(br.readLine());

            if (cur == -1) {
                break;
            } else if (cur == 0) {
                queue.poll();
            } else if (cur > 0 && queue.size() < N){
                queue.add(cur);
            }
        }

        if (queue.isEmpty()) {
            System.out.println("empty");
            return;
        }

        while (!queue.isEmpty()) {
            sb.append(queue.poll()).append(" ");
        }

        System.out.println(sb);
    }
}