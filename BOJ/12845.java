import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[n];
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            nums[i] = num;
            if (max < num) {
                max = num;
                maxIndex = i;
            }
        }

        int gold = 0;

        for (int i = 0; i < n; i++) {
            if (i == maxIndex) continue;
            gold += nums[i] + max;
        }


        System.out.println(gold);
    }
}