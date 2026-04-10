import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;

        while (true) {
            str = br.readLine();
            if (str.equals("-1")) break;
            st = new StringTokenizer(str);
            int n = st.countTokens();
            int cnt = 0;

            int[] arr = new int[n];
            boolean[] visited = new boolean[101];

            for (int i = 0; i < n - 1; i++) {
                int cur = Integer.parseInt(st.nextToken());
                arr[i] = cur;
                visited[cur] = true;
            }

            st.nextToken();

            for (int i = 0; i < n; i++) {
                int twice = arr[i] * 2;

                if (twice >= 100) continue;
                if (visited[twice]) cnt++;
            }

            sb.append(cnt).append("\n");
        }

        System.out.print(sb);
    }
}
