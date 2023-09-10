import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        if (m * k <= n) {
            System.out.printf("%d %d", n - (m * k), n - ((m * k) - (m - 1)));
        } else {
            System.out.printf("0 %d", n - (m * (k - 1)) - 1);
        }
    }
}
