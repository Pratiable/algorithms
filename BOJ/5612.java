import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int max = n;
        int now = n;

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int in = Integer.parseInt(st.nextToken());
            int out = Integer.parseInt(st.nextToken());

            now = now + in - out;
            if (now < 0) {
                System.out.println(0);
                return;
            }
            max = Math.max(max, now);
        }

        System.out.println(max);
    }
}
