import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        int idx = 0;

        while (idx < n) {
            cnt++;
            while (idx + 1 < n && nums[idx] > nums[idx + 1]) {
                idx++;
            }
            idx++;
        }

        System.out.println(cnt);
    }
}