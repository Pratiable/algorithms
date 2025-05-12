import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        if (n == 0 || m == 0) {
            System.out.println(1);
            return;
        }
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[m];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a, Collections.reverseOrder());
        Arrays.sort(b, Collections.reverseOrder());
        int idx = 0;
        int cnt = 1;

        Loop:
        for (int i = 0; i < n; i++) {
            int now = a[i];
            for (int j = 0; j < now; j++) {
                cnt += b[idx];
                idx++;
                if (idx == m) {
                    cnt--;
                    break Loop;
                }
            }
            cnt--;
        }

        System.out.println(cnt);
    }
}
