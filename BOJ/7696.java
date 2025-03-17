import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] nums = new int[1_000_001];
        int cnt = 1;
        int idx = 0;
        while (idx < 1_000_001) {
            int now = cnt;
            int mask = 0;
            boolean isRepeated = false;

            while (now > 0) {
                int fDigit = now % 10;
                if ((mask & (1 << fDigit)) != 0) {
                    isRepeated = true;
                    break;
                }
                mask |= (1 << fDigit);
                now /= 10;
            }

            if (!isRepeated) {
                nums[idx] = cnt;
                idx++;
            }

            cnt++;
        }

        while (true) {
            int now = Integer.parseInt(br.readLine());
            if (now == 0) break;
            sb.append(nums[now - 1]).append("\n");
        }

        System.out.println(sb);
    }
}
