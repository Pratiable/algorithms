import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] set = new int[m];
        int[] one = new int[m];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            set[i] = Integer.parseInt(st.nextToken());
            one[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(set);
        Arrays.sort(one);

        if (n <= 6) {
            System.out.println(Math.min(set[0], one[0] * n));
        } else {
            if (n % 6 == 0) {
                System.out.println(Math.min(set[0] * (n / 6), one[0] * n));
            } else {
                System.out.println(Math.min(set[0] * ((n / 6) + 1), Math.min((set[0] * (n / 6) + one[0] * (n % 6)), one[0] * n)));
            }
        }
    }
}