import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int max = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            HashSet<Integer> set = new HashSet<>();
            set.add(x);
            set.add(y);
            set.add(z);

            if (set.size() == 1) {
                max = Math.max(max, 10000 + (x * 1000));
            } else if (set.size() == 2) {
                max = Math.max(max, x == y || x == z ? 1000 + (x * 100) : 1000 + (y * 100));
            } else {
                max = Math.max(max, Math.max(x, y) > z ? Math.max(x, y) * 100 : z * 100);
            }
        }
        System.out.println(max);
    }
}