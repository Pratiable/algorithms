import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            Stack<String> stack = new Stack<>();
            st = new StringTokenizer(br.readLine());
            int size = st.countTokens();
            while(st.hasMoreTokens()) {
                stack.push(st.nextToken());
            }
            bw.append(String.format("Case #%d:", i + 1));
            for (int j = 0; j < size; j++) {
                bw.append(" ").append(stack.pop());
            }
            bw.append("\n");
        }

        bw.flush();
        bw.close();
    }
}