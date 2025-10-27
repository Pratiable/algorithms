import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        boolean[] visited = new boolean[200_001];
        int cnt = 0;
        int inCnt = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (b == 1) {
                if (visited[a]) {
                    cnt++;
                } else {
                    visited[a] = true;
                    inCnt++;
                }
            } else {
                if (!visited[a]) {
                    cnt++;
                } else {
                    visited[a] = false;
                    inCnt--;
                }
            }
        }

        System.out.print(cnt + inCnt);
    }
}
