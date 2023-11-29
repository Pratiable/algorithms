import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int under = Integer.parseInt(st.nextToken());
        int over = Integer.parseInt(st.nextToken());

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int used = Integer.parseInt(br.readLine());
            int r = (used <= 1000) ? used * under : 1000 * under + (used - 1000) * over;
            sb.append(used).append(" ").append(r).append("\n");
        }

        System.out.println(sb);
    }
}
