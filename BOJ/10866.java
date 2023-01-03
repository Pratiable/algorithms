import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<String> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            String str;

            switch (command) {
                case "push_back":
                    str = st.nextToken();
                    deque.offerLast(str);
                    break;
                case "push_front":
                    str = st.nextToken();
                    deque.offerFirst(str);
                    break;
                case "pop_front":
                    str = deque.pollFirst();
                    sb.append(str != null ? str : -1).append("\n");
                    break;
                case "pop_back":
                    str = deque.pollLast();
                    sb.append(str != null ? str : -1).append("\n");
                    break;
                case "size":
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty":
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    str = deque.peekFirst();
                    sb.append(str != null ? str : -1).append("\n");
                    break;
                case "back":
                    str = deque.peekLast();
                    sb.append(str != null ? str : -1).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}