import java.io.*;
import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        Loop:
        for (int t = 0; t < T; t++) {
            String commands = br.readLine();
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), "[,]");
            Deque<Integer> deque = new ArrayDeque<>();
            boolean isReversed = false;

            while (st.hasMoreTokens()) {
                deque.add(Integer.parseInt(st.nextToken()));
            }

            for (int i = 0; i < commands.length(); i++) {
                char cmd = commands.charAt(i);

                if (cmd == 'R') {
                    isReversed = !isReversed;
                } else {
                    if (deque.isEmpty()) {
                        sb.append("error\n");
                        continue Loop;
                    }

                    if (isReversed) {
                        deque.pollLast();
                    } else {
                        deque.pollFirst();
                    }
                }
            }
            sb.append('[');
            int length = deque.size();
            for (int i = 0; i < length; i++) {
                if (isReversed) {
                    sb.append(deque.pollLast());
                } else {
                    sb.append(deque.pollFirst());
                }

                if (i != length - 1) sb.append(',');
            }
            sb.append("]\n");
        }

        System.out.println(sb);
    }
}
