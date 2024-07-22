import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a + b <= c || b + c <= a || c + a <= b) {
                sb.append("Case #").append(t).append(": invalid!").append("\n");
            } else if (a == b && b == c) {
                sb.append("Case #").append(t).append(": equilateral").append("\n");
            } else if (a == b || b == c || c == a) {
                sb.append("Case #").append(t).append(": isosceles").append("\n");
            } else {
                sb.append("Case #").append(t).append(": scalene").append("\n");
            }
        }

        System.out.println(sb);
    }
}