import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int sum = 0;
        int[] nums = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int cur = Integer.parseInt(st.nextToken());
            nums[i] = cur;
            if (i < K) sum += cur;
        }

        int max = sum;

        for (int i = K; i < N; i++) {
            sum += nums[i] - nums[i - K];
            if (sum > max) max = sum;
        }

        System.out.print(max);
    }
}
