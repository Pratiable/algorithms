import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int maxS = Integer.MIN_VALUE;
        int minC = Integer.MAX_VALUE;
        int minL = Integer.MAX_VALUE;
        int winner = 1;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int L = Integer.parseInt(st.nextToken());
            if (S > maxS || (S == maxS && C < minC) || (S == maxS && C == minC && L < minL)) {
                maxS = S;
                minC = C;
                minL = L;
                winner = i + 1;
            }
        }

        System.out.println(winner);
    }
}
