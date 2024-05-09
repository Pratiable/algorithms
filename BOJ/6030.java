import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= p; i++) {
            if (p % i != 0) continue;
            for (int j = 1; j <= q; j++) {
                if (q % j != 0) continue;
                sb.append(i + " " + j + "\n");
            }
        }

        System.out.println(sb);
    }
}