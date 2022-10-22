import java.io.*;
import java.util.*;

public class Main {
    public static Stack<Integer>endStack = new Stack<>();
    public static Stack<Integer> waitStack = new Stack<>();
    public static String result = "Nice";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        endStack.push(0);

        while (st.hasMoreTokens()) {
            int now = Integer.parseInt(st.nextToken());
            checkLine(now);
            if (Objects.equals(result, "Sad")) {
                break;
            }
        }

        System.out.println(result);

        bw.flush();
        bw.close();
    }

    public static void checkLine(int a) {
        if (endStack.peek() == a - 1) {
            endStack.push(a);
        } else if (waitStack.size() != 0 && waitStack.peek() > a) {
            waitStack.push(a);
        } else if (waitStack.size() == 0) {
            waitStack.push(a);
        } else if (endStack.peek() == waitStack.peek() - 1) {
            endStack.push(waitStack.pop());
            checkLine(a);
        } else {
            result = "Sad";
        }
    }
}