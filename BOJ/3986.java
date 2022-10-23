import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 0; i < n; i++) {
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();
            stack.push(str.charAt(0));
            for (int j = 1; j < str.length(); j++) {
                if (stack.size() != 0 && stack.peek() == str.charAt(j)) {
                    stack.pop();
                } else {
                    stack.push(str.charAt(j));
                }
            }
            if (stack.size() == 0) {
                result++;
            }
        }
        System.out.println(result);
        bw.flush();
        bw.close();
    }
}