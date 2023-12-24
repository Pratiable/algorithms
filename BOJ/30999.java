import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int sum = 0;

        for (int t = 0; t < n; t++) {
            String str = br.readLine();
            int o = 0;
            int x = 0;
            for (int i = 0; i < m; i++) {
                if (str.charAt(i) == 'O') {
                    o++;
                    continue;
                }
                x++;
            }

            if (o > x) sum++;
        }

        System.out.println(sum);
    }
}
