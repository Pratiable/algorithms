import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] sizes = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            sizes[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int shirtsSum = 0;

        for (int i = 0; i < 6; i++) {
            shirtsSum += (sizes[i] / t) + (sizes[i] % t == 0 ? 0 : 1);
        }

        System.out.println(shirtsSum);
        System.out.printf("%d %d", n / p, n % p);
    }
}
