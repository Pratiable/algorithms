import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int need = m * k;
        Integer[] pens = new Integer[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            pens[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(pens, Collections.reverseOrder());

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            cnt += pens[i];
            if (cnt >= need) {
                System.out.println(i + 1);
                return;
            }
        }

        System.out.println("STRESS");
    }
}