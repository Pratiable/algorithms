import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] nums = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;

        Loop:
        for (int last = n - 1; last >= 1; last--) {
            for (int i = 0; i < last; i++) {
                if (nums[i] > nums[i + 1]) {
                    int tmp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = tmp;
                    cnt++;
                }

                if (cnt == k) break Loop;
            }
        }

        System.out.println(cnt == k ? Arrays.stream(nums).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : -1);
    }
}