import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < a; j++) {
                for (int k = 0; k < c; k++) {
                    sb.append((((i + k) % 2 == 0) ? "X" : ".").repeat(b));
                }
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }
}
