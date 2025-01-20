import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            String symbol = st.nextToken();
            int y = Integer.parseInt(st.nextToken());
            st.nextToken();
            int z = Integer.parseInt(st.nextToken());
            boolean isRight;

            if (symbol.equals("+")) {
                isRight = (x + y == z);
            } else {
                isRight = (x - y == z);
            }

            sb.append("Case ").append(i + 1).append(": ").append(isRight ? "YES" : "NO").append("\n");
        }

        System.out.println(sb);
    }
}