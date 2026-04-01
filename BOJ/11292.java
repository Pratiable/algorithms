import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) break;

            String[] names = new String[N];
            int[] heights = new int[N];
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                names[i] = st.nextToken();
                int height = (int) (Double.parseDouble(st.nextToken()) * 100);

                heights[i] = height;
                max = Math.max(max, height);
            }

            for (int i = 0; i < N; i++) {
                if (heights[i] == max) {
                    sb.append(names[i]).append(" ");
                }
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }
}
