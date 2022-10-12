import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int now = Integer.parseInt(br.readLine());
            if (now == 0) {
                stack.pop();
                continue;
            }
            stack.push(now);
        }

        int stackSize = stack.size();
        for (int j = 0; j < stackSize; j++) {
            sum += stack.pop();
        }

        System.out.println(sum);

        bw.flush();
        bw.close();
    }
}