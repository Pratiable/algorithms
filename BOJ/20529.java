import java.io.*;
import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            if (n > 32) {
                sb.append(0).append("\n");
                continue;
            }
            String[] mbtis = new String[n];

            for (int i = 0; i < n; i++) {
                mbtis[i] = st.nextToken();
            }

            int min = Integer.MAX_VALUE;

            for (int i = 0; i < n - 2; i++) {
                for (int j = i + 1; j < n - 1; j++) {
                    for (int k = j + 1; k < n; k++) {
                        int dist = 0;
                        for (int l = 0; l < 4; l++) {
                            if (mbtis[i].charAt(l) != mbtis[j].charAt(l)) dist++;
                            if (mbtis[j].charAt(l) != mbtis[k].charAt(l)) dist++;
                            if (mbtis[i].charAt(l) != mbtis[k].charAt(l)) dist++;
                        }
                        min = Math.min(dist, min);
                    }
                }
            }


            sb.append(min).append("\n");
        }

        System.out.println(sb);
    }
}
