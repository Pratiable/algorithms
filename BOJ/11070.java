import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[] scores = new int[n + 1];
            int[] losses = new int[n + 1];

            double max = Integer.MIN_VALUE;
            double min = Integer.MAX_VALUE;

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int p = Integer.parseInt(st.nextToken());
                int q = Integer.parseInt(st.nextToken());

                scores[a] += p;
                losses[a] += q;
                scores[b] += q;
                losses[b] += p;
            }

            for (int i = 0; i < n; i++) {
                double w = scores[i + 1] == 0 && losses[i + 1] == 0 ? 0 : Math.pow(scores[i + 1], 2) / (Math.pow(scores[i + 1], 2) + Math.pow(losses[i + 1], 2));
                max = Math.max(max, w);
                min = Math.min(min, w);
            }

            sb.append((int) Math.floor(max * 1000)).append("\n");
            sb.append((int) Math.floor(min * 1000)).append("\n");
        }
        System.out.println(sb);
    }
}