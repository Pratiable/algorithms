import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int now = 0;

        for (int i = 0; i < n + m; i++) {
            int next = Integer.parseInt(br.readLine());

            if (next == 1) {
                now++;
                if (now > s) {
                    s *= 2;
                }
            } else {
                now--;
            }
        }

        System.out.println(s);
    }
}
