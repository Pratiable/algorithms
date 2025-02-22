import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            if (y < 1989) {
                sb.append("Yes").append("\n");
            } else if (y > 1989) {
                sb.append("No").append("\n");
            } else {
                if (m < 2) {
                    sb.append("Yes").append("\n");
                } else if (m > 2) {
                    sb.append("No").append("\n");
                } else {
                    if (d <= 27) {
                        sb.append("Yes").append("\n");
                    } else {
                        sb.append("No").append("\n");
                    }
                }
            }
        }

        System.out.println(sb);
    }
}