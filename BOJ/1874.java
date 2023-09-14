import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int now = 2;

        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        sb.append("+\n");
        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(br.readLine());
            boolean found = false;
            if (!stack.isEmpty() && stack.peek() == target) {
                stack.pop();
                sb.append("-\n");
                continue;
            }

            while (now <= n) {
                stack.add(now);
                sb.append("+\n");
                now++;
                if (now - 1 == target) {
                    sb.append("-\n");
                    stack.pop();
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println(sb);
    }
}