import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();
        int[] nums = new int[16];

        for (int i = 0; i < 8; i++) {
            nums[i * 2] = A.charAt(i) - '0';
            nums[i * 2 + 1] = B.charAt(i) - '0';
        }

        int len = 16;

        while (len > 2) {
            for (int i = 0; i < len - 1; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
            
            len--;
        }

        System.out.printf("%d%d", nums[0], nums[1]);
    }
}
