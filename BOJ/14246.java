import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] nums = new long[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Long.parseLong(st.nextToken());
        }

        int k = Integer.parseInt(br.readLine());
        
        long cnt = 0;
        long sum = 0;
        int left = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            while (left <= i && sum > k) {
                sum -= nums[left++];
            }

            cnt += left;
        }

        System.out.println(cnt);
    }
}
