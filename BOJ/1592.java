import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        if (M == 1) {
            System.out.print(0);
            return;
        }

        int[] ppl = new int[N];
        int cur = 0;
        int cnt = 0;
        ppl[cur] = 1;


        while (true) {
            if (ppl[cur] % 2 == 1) {
                cur = (cur + L) % N;
            } else {
                cur = (cur - L) % N;
                if (cur < 0) cur += N;
            }

            cnt++;
            ppl[cur]++;

            if (ppl[cur] == M) break;
        }

        System.out.print(cnt);
    }
}
