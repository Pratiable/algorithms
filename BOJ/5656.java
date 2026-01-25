import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        int tc = 1;

        loop:
        while ((str = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            String cmd = st.nextToken();
            int b = Integer.parseInt(st.nextToken());
            boolean bool = false;

            switch (cmd) {
                case "E":
                    break loop;
                case ">":
                    bool = a > b;
                    break;
                case ">=":
                    bool = a >= b;
                    break;
                case "<":
                    bool = a < b;
                    break;
                case "<=":
                    bool = a <= b;
                    break;
                case "==":
                    bool = a == b;
                    break;
                case "!=":
                    bool = a != b;
                    break;
            }

            sb.append("Case ").append(tc++).append(": ").append(bool ? "true" : "false").append("\n");
        }

        System.out.print(sb);
    }
}
