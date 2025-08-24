import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < t; tc++) {
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int[] people = new int[n];

            for (int i = 0; i < n; i++) {
                people[i] = Integer.parseInt(st.nextToken());
            }

            long sum = 0;
            Arrays.sort(people);

            for (int i = n - 2; i >= 0; i -= 2) {
                sum += people[i + 1];
            }

            if (n % 2 == 1) {
                sum += people[0];
            }

            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }
}
