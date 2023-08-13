import java.io.*;
import java.util.*;

public class Main {
    static int[] lines;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        long max = Integer.MIN_VALUE;

        lines = new int[k];

        for (int i = 0; i < k; i++) {
            lines[i] = Integer.parseInt(br.readLine());
        }

        long start = 1;
        long end = Integer.MAX_VALUE + 1L;

        while (start <= end) {
            long mid = (start + end) / 2;
            long sum = cutLine(mid);
            if (sum >= n) {
                max = Math.max(max, mid);
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(max);
    }

    static long cutLine(long cut) {
        long sum = 0;
        for (long num : lines) {
            sum += num / cut;
        }

        return sum;
    }
}
