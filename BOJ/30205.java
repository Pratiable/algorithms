import java.io.*;
import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long p = Long.parseLong(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            long[] level = new long[m];
            for (int j = 0; j < m; j++) {
                level[j] = Long.parseLong(st.nextToken());
            }

            int items = 0;

            Arrays.sort(level);

            for (int j = 0; j < m; j++) {
                if (level[j] == -1) {
                    items++;
                } else if (level[j] <= p) {
                    p += level[j];
                } else {
                    while (items > 0) {
                        p *= 2;
                        items--;
                        if (level[j] <= p) break;
                    }

                    if (level[j] > p) {
                        System.out.println(0);
                        return;
                    }

                    p += level[j];
                }
            }

            for (int k = 0; k < items; k++) {
                p <<= 1;
            }
        }

        System.out.println(1);
    }
}
