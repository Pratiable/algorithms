import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int aMax = 0;
        for (int i = 0; i < n; i++) {
            aMax = Math.max(aMax, Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        int bMax = 0;
        for (int i = 0; i < m; i++) {
            bMax = Math.max(bMax, Integer.parseInt(st.nextToken()));
        }

        System.out.println(aMax + bMax);
    }
}