import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int t = 1;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0 && c == 0) break;
            if (a == 0 || b == 0 || c == 0) {
                sb.append("Triangle #").append(t++).append("\n");
                sb.append("Impossible.\n\n");
                continue;
            }

            if (a == -1) {
                sb.append("Triangle #").append(t++).append("\n");
                if (b >= c) {
                    sb.append("Impossible.\n\n");
                    continue;
                }
                sb.append("a = ").append(String.format("%.3f", Math.sqrt(Math.pow(c, 2) - Math.pow(b, 2)))).append("\n\n");
            } else if (b == -1) {
                sb.append("Triangle #").append(t++).append("\n");
                if (a >= c){
                    sb.append("Impossible.\n\n");
                    continue;
                }
                sb.append("b = ").append(String.format("%.3f", Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2)))).append("\n\n");
            } else {
                sb.append("Triangle #").append(t++).append("\n");
                sb.append("c = ").append(String.format("%.3f", Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)))).append("\n\n");
            }

        }

        System.out.println(sb);
    }
}