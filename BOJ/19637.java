import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] powers = new int[n];
        String[] titles = new String[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String title = st.nextToken();
            int power = Integer.parseInt(st.nextToken());

            powers[i] = power;
            titles[i] = title;
        }


        for (int i = 0; i < m; i++) {
            int power = Integer.parseInt(br.readLine());
            int start = 0;
            int end = n - 1;
            int max = 0;

            while (start <= end) {
                int mid = (start + end) / 2;

                if (power <= powers[mid]) {
                    max = mid;
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            sb.append(titles[max]).append("\n");
        }

        System.out.println(sb);
    }
}
