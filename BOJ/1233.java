import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S1 = Integer.parseInt(st.nextToken());
        int S2 = Integer.parseInt(st.nextToken());
        int S3 = Integer.parseInt(st.nextToken());
        int total = S1 + S2 + S3;
        int maxNum = 0;
        int max = 0;
        int[] sums = new int[total + 1];

        for (int i = 1; i <= S1; i++) {
            for (int j = 1; j <= S2; j++) {
                for (int k = 1; k <= S3; k++) {
                    sums[i + j + k]++;
                }
            }
        }

        for (int i = 0; i <= total; i++) {
            if (sums[i] > max) {
                max = sums[i];
                maxNum = i;
            }
        }

        System.out.print(maxNum);
    }
}
