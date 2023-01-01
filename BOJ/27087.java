import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());

            if ((a % p == 0 && b % p == 0) ||
                (a % p == 0 && c % p == 0) ||
                (b % p == 0 && c % p == 0)) {
                sb.append("1\n");
                continue;
            }
            sb.append("0\n");
        }
        System.out.println(sb);
    }
}