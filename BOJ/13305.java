import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long[] roads = new long[N - 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N - 1; i++) {
            roads[i] = Long.parseLong(st.nextToken());
        }

        long[] prices = new long[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            prices[i] = Long.parseLong(st.nextToken());
        }

        long min = Long.MAX_VALUE;
        long sum = 0;

        for (int i = 0; i < N - 1; i++) {
            min = Math.min(min, prices[i]);
            sum += min * roads[i];
        }

        System.out.println(sum);
    }
}
