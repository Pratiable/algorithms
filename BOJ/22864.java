import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int tired = 0;
        int count = 0;

        for (int i = 0; i < 24; i++) {
            if (tired + A <= M) {
                tired += A;
                count += B;
            } else {
                tired = Math.max(tired - C, 0);
            }
        }

        System.out.print(count);
    }
}
