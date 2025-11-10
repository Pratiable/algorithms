import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] nums = br.readLine().toCharArray();

        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 0; i--) {
            sb.append(nums[i]);
        }

        System.out.print(sb);
    }
}
