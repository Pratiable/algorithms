import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] nums = new long[3];
        nums[0] = Long.parseLong(st.nextToken());
        nums[1] = Long.parseLong(st.nextToken());
        nums[2] = Long.parseLong(st.nextToken());

        Arrays.sort(nums);

        System.out.println(nums[1]);
    }
}
