import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String back = null;

        Queue<String> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            String num;

            switch (command) {
                case "push":
                    num = st.nextToken();
                    back = num;
                    queue.add(num);
                    break;
                case "pop":
                    num = queue.poll();
                    sb.append(num == null ? "-1" : num).append("\n");
                    if (queue.isEmpty()) {
                        back = null;
                    }
                    break;
                case "front":
                    num = queue.peek();
                    sb.append(num == null ? "-1" : num).append("\n");
                    break;
                case "back":
                    sb.append(back == null ? "-1" : back).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}