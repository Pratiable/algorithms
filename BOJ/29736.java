import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int ks = k - x;
        int kb = k + x;

        int cnt = 0;

        for (int i = a; i <= b; i++) {
            if (i >= ks && i <= kb) {
                cnt++;
            }
        }

        System.out.println(cnt == 0 ? "IMPOSSIBLE" : cnt);
    }
}
