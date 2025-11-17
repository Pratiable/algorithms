import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int pulse = m;
        int exerciseTime = 0;
        int cnt = 0;

        if (m + T > M) {
            System.out.print(-1);
            return;
        }

        while (exerciseTime < N) {
            cnt++;

            if (pulse + T <= M) {
                exerciseTime++;
                pulse += T;
            } else {
                pulse = Math.max(pulse - R, m);
            }
        }

        System.out.print(cnt);
    }
}
