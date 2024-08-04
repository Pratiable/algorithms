import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 0 ; t < T ; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            String cmd = st.nextToken();
            st = new StringTokenizer(br.readLine());
            if (cmd.equals("C")) {
                for (int i = 0; i < n; i++) {
                    char c = st.nextToken().charAt(0);
                    sb.append(c - 'A' + 1).append(" ");
                }
            } else {
                for (int i = 0; i < n; i++) {
                    int num = Integer.parseInt(st.nextToken());
                    sb.append((char)(num + 'A' - 1)).append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}