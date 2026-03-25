import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[5];

        for (int i = 0; i < 5; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        
        while (true) {
            boolean isSorted = true;

            for (int i = 0; i < 5; i++) {
                if (nums[i] != i + 1) {
                    isSorted = false;
                    break;
                }
            }

            if (isSorted) break;

            for (int i = 0; i < 4; i++) {
                if (nums[i] > nums[i + 1]) {
                    int tmp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = tmp;

                    for (int j = 0; j < 5; j++) {
                        sb.append(nums[j]).append(" ");
                    }

                    sb.append("\n");
                }
            }
        }

        System.out.print(sb);
    }
}
