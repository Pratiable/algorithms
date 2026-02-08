import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int max = -1;
        int maxIdx = 0;

        String[] clubs = {
                "PROBRAIN", "GROW", "ARGOS", "ADMIN", "ANT",
                "MOTION", "SPG", "COMON", "ALMIGHTY"
        };


        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            int curMax = 0;

            for (int j = 0; j < N; j++) {
                curMax = Math.max(curMax, Integer.parseInt(st.nextToken()));
            }

            if (curMax > max) {
                max = curMax;
                maxIdx = i;
            }
        }

        System.out.print(clubs[maxIdx]);
    }
}
