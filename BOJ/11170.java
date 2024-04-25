import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int cnt = 0;

            for (int i = n; i <= m; i++) {
                String str = String.valueOf(i);

                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == '0') cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}