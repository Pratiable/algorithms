import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            st = new StringTokenizer(str);
            boolean mack = false;
            boolean zack = false;

            while (st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken());
                if (num == 18) {
                    mack = true;
                } else if (num == 17) {
                    zack = true;
                }
            }

            sb.append(str).append("\n");
            if (mack && zack) {
                sb.append("both\n\n");
            } else if (mack) {
                sb.append("mack\n\n");
            } else if (zack) {
                sb.append("zack\n\n");
            } else {
                sb.append("none\n\n");
            }
        }

        System.out.println(sb);
    }
}
