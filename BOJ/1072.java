import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        long winRate = y * 100L / x;

        if (winRate > 98) {
            System.out.println(-1);
            return;
        }

        long min = 0;

        long start = 1;
        long end = 1_000_000_000L;

        while (start <= end) {
            long mid = (start + end) / 2;
            long nowRate = (y + mid) * 100 / (x + mid);

            if (nowRate > winRate) {
                min = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(min);
    }
}
