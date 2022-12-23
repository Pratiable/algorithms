import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        boolean[] visited = new boolean[N + 1];

        sb.append("<");
        int count = 0;
        int length = N;
        int idx = 1;

        while (true) {
            if (visited[idx]) {
                idx++;
                if (idx == N + 1) {
                    idx = 1;
                }
                continue;
            }
            count++;

            if (count == K) {
                length--;
                if (length == 0) {
                    sb.append(idx);
                    break;
                }
                visited[idx] = true;
                sb.append(idx).append(", ");
                count = 0;
            }
            idx++;
            if (idx == N + 1) {
                idx = 1;
            }
        }

        sb.append(">");

        System.out.println(sb);
    }
}