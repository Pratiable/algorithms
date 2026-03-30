import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        int cnt = 0;
        boolean[] visited = new boolean[N + 1];

        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int I = Integer.parseInt(st.nextToken());

            for (int j = L; j <= N; j += I) {
                visited[j] = true;
            }
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) cnt++;
        }

        System.out.print(cnt);
    }
}
