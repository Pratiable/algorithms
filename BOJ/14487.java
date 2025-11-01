import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            int v = Integer.parseInt(st.nextToken());

            max = Math.max(v, max);
            sum += v;
        }

        System.out.print(sum - max);
    }
}
