import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int max = 0;
        int cnt = 0;

        for (int t = 0; t < n; t++) {
            String str = br.readLine();
            int c = 0;
            int tmp = 0;
            for (int i = 0; i < l; i++) {
                if (str.charAt(i) == '1') {
                    if (tmp == 0) c++;
                    tmp = 1;
                    continue;
                }
                tmp = 0;
            }

            if (max < c) {
                max = c;
                cnt = 1;
            } else if (c == max) {
                cnt++;
            }
        }

        System.out.println(max + " " + cnt);
    }
}
