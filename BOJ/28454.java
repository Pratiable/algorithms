import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        int y = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), "-");
            int ny = Integer.parseInt(st.nextToken());
            int nm = Integer.parseInt(st.nextToken());
            int nd = Integer.parseInt(st.nextToken());

            if (ny > y || (ny == y && nm > m) || (ny == y && nm == m && nd >= d)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
