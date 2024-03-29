import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int start = st.nextToken().charAt(0) - 'A';

            for (int i = 0; i < n; i++) {
                sb.append(Character.toString(start + 'A').repeat(i + 1)).append("\n");
                start = start == 25 ? 0 : start + 1;
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
