import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());
            switch (cmd) {
                case 1:
                    deq.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    deq.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    sb.append(deq.isEmpty() ? -1 : deq.pollFirst()).append("\n");
                    break;
                case 4:
                    sb.append(deq.isEmpty() ? -1 : deq.pollLast()).append("\n");
                    break;
                case 5:
                    sb.append(deq.size()).append("\n");
                    break;
                case 6:
                    sb.append(deq.isEmpty() ? 1 : 0).append("\n");
                    break;
                case 7:
                    sb.append(deq.isEmpty() ? -1 : deq.getFirst()).append("\n");
                    break;
                default:
                    sb.append(deq.isEmpty() ? -1 : deq.getLast()).append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}