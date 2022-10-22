import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, String> map = new HashMap<>();
        map.put("(", ")");
        map.put("[", "]");

        Check:
        while (true) {
            String str = br.readLine();
            Stack<String> stack = new Stack<>();

            if (Objects.equals(str, ".")) break;

            for (int i = 0 ; i < str.length(); i++) {
                String now = String.valueOf(str.charAt(i));
                if (map.containsKey(now)) {
                    stack.push(now);
                } else if (map.containsValue(now)) {
                    if (stack.size() != 0 && Objects.equals(map.get(stack.peek()), now)) {
                        stack.pop();
                    } else {
                        bw.append("no\n");
                        continue Check;
                    }
                }
            }

            if (stack.size() == 0) bw.append("yes\n");
            else bw.append("no\n");
        }

        bw.flush();
        bw.close();
    }
}