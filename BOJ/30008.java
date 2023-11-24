import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) {
            int g = Integer.parseInt(st.nextToken());
            int p = (int) (100.0 * g / n);
            if (p <= 4) sb.append(1);
            else if (p <= 11) sb.append(2);
            else if (p <= 23) sb.append(3);
            else if (p <= 40) sb.append(4);
            else if (p <= 60) sb.append(5);
            else if (p <= 77) sb.append(6);
            else if (p <= 89) sb.append(7);
            else if (p <= 96) sb.append(8);
            else sb.append(9);
            sb.append(" ");
        }

        System.out.println(sb);
    }
}
