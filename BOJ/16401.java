import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] snacks = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            snacks[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(snacks);

        int max = 0;

        int start = 1;
        int end = snacks[n - 1];

        while (start <= end) {
            int mid = (start + end) / 2;
            int pieces = 0;

            for (int i = 0; i < n; i++) {
                pieces += snacks[i] / mid;
            }

            if (pieces < m) {
                end = mid - 1;
            } else {
                max = mid;
                start = mid + 1;
            }
        }

        System.out.println(max);
    }
}
