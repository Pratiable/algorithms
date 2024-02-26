import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 1;
        int prev = Integer.parseInt(st.nextToken());
        int length = 1;
        boolean isUp = true;

        for (int i = 1; i < n; i++) {
            int now = Integer.parseInt(st.nextToken());
            if (now > prev && isUp) {
                length++;
            } else if (now < prev) {
                isUp = false;
                length++;
            } else if (now == prev) {
                max = Math.max(length, max);
                length = 1;
                isUp = true;
            } else {
                max = Math.max(length, max);
                length = 2;
                isUp = true;
            }

            prev = now;
        }

        max = Math.max(length, max);

        System.out.println(max);
    }
}
