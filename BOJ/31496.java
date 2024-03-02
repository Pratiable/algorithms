import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String str = st.nextToken().trim();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String now = st.nextToken();
            int num = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(now, "_");

            while (st.hasMoreTokens()) {
                if (Objects.equals(st.nextToken(), str)) {
                    sum += num;
                    break;
                }
            }
        }

        System.out.println(sum);
    }
}