import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String str;
        for (int i = 0; i < n; i++) {
            Stack<Character> stack = new Stack<>();
            str = br.readLine();

            if (Objects.equals(str.charAt(0), ')')) {
                bw.append("NO\n");
                continue;
            }
            stack.push(str.charAt(0));
            try {
                for (int j = 1; j < str.length(); j++) {
                    if (Objects.equals(str.charAt(j), ')') && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        stack.push(str.charAt(j));
                    }
                }

                if (stack.size() != 0) {
                    bw.append("NO\n");
                } else {
                    bw.append("YES\n");
                }

            } catch (EmptyStackException e) {
                bw.append("NO\n");
            }
        }

        bw.flush();
        bw.close();
    }
}