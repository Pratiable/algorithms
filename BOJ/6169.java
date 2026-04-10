import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int U = Integer.parseInt(st.nextToken());
        int F = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int sum = 0;
        int dist = 0;

        for (int i = 0; i < T; i++) {
            char cur = br.readLine().charAt(0);
            int time;

            if (cur == 'u' || cur == 'd') {
                time = U + D;
            } else {
                time = F + F;
            }

            if (sum + time > M) break;

            sum += time;
            dist++;
        }

        System.out.print(dist);
    }
}
