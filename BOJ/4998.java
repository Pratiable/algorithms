import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String line;

        while ((line = br.readLine()) != null) {
            st = new StringTokenizer(line);
            double n = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken()) / 100 + 1;
            double m = Double.parseDouble(st.nextToken());
            int cnt = 0;

            while (true) {
                if (n >= m) break;
                n *= b;
                cnt++;
            }

            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}