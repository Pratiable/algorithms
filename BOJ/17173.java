import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] nums = new int[m];
        for (int i = 0; i < m; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int k = 0; k < m; k++) {
                if (i % nums[k] == 0) {
                    sum += i;
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
