import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<Balloon> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            deque.add(new Balloon(i, Integer.parseInt(st.nextToken())));
        }

        for (int i = 0; i < n; i++) {
            Balloon now = deque.pollFirst();
            sb.append(now.idx + 1).append(" ");
            if (deque.isEmpty()) break;
            int s = now.move;

            if (s > 0) {
                for (int j = 0; j < s - 1; j++) deque.offerLast(deque.pollFirst());
            } else {
                for (int j = 0; j > s; j--) deque.offerFirst(deque.pollLast());
            }
        }

        System.out.println(sb);
    }

    static class Balloon {
        int idx, move;

        Balloon(int i, int s) {
            idx = i;
            move = s;
        }
    }
}
