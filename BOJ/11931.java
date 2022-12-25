import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] nums = new Integer[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(nums, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < n; j++) {
            sb.append(nums[j]).append("\n");
        }
        
        System.out.println(sb);
    }
}