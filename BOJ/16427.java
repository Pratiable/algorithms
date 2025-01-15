import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int max = 0;
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(st.nextToken());
            max = Math.max(max, m);
        }

        System.out.println(((max * s) + 999) / 1000);
    }
}
