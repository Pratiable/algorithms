import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int nt = Integer.parseInt(st.nextToken());
            long sum = 0;
            for (int j = 0; j < nt; j++) {
                sum += Long.parseLong(st.nextToken());
            }

            nums[i] = sum;
        }


        Arrays.sort(nums);

        long sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                sum += nums[j];
            }
        }


        System.out.println(sum);
    }
}