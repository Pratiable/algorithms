import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] dreams = new int[m];

        for (int i = 0; i < m; i++) {
            dreams[i] = Integer.parseInt(st.nextToken());
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m - (n + i * (n - 1)) + 1; j++) {
                boolean made = true;
                for (int k = 0; k < n; k++) {
                    if (nums[k] != dreams[j + k + (k * i)]) {
                        made = false;
                        break;
                    }
                }

                if (made) {
                    min = Math.min(min, i);
                    max = Math.max(max, i);
                    break;
                }
            }
        }

        System.out.println(min == Integer.MAX_VALUE ? -1 : String.format("%d %d", min, max));
    }
}