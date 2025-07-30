import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            int J = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            Integer[] boxes = new Integer[N];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                int R = Integer.parseInt(st.nextToken());
                int C = Integer.parseInt(st.nextToken());
                boxes[i] = R * C;
            }

            Arrays.sort(boxes, Collections.reverseOrder());

            int sum = 0;
            int cnt = 0;

            for (int i = 0; i < N; i++) {
                sum += boxes[i];
                cnt++;

                if (sum >= J) break;
            }
            
            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}
