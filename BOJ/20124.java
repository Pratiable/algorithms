import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int bScore = Integer.MIN_VALUE;
        String bName = "";

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String A = st.nextToken();
            int B = Integer.parseInt(st.nextToken());

            if (B > bScore) {
                bName = A;
                bScore = B;
            } else if (B == bScore) {
                if (A.compareTo(bName) < 0) {
                    bName = A;
                }
            }
        }

        System.out.print(bName);
    }
}
