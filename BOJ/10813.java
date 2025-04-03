import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] nums = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {
            nums[i] = i;
        }

        int tmp;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            tmp = nums[b];

            nums[b] = nums[a];
            nums[a] = tmp;
        }


        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < n + 1; i++) {
            sb.append(nums[i]).append(" ");
        }

        System.out.println(sb);
    }
}