import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            String str = br.readLine();
            st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            sb.append(str).append("\n");

            if (a < 10 && b < 10 && c < 10) {
                sb.append("zilch");
            } else if (a >= 10 && b >= 10 && c >= 10) {
                sb.append("triple-double");
            } else if (a >= 10 && b >= 10 || a >= 10 && c >= 10 || b >= 10 && c >= 10) {
                sb.append("double-double");
            } else {
                sb.append("double");
            }

            sb.append("\n\n");
        }

        System.out.println(sb);
    }
}
