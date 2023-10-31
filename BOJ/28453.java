import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int lvl = Integer.parseInt(st.nextToken());
            if (lvl == 300) {
                sb.append(1).append(" ");
            } else if (lvl >= 275) {
                sb.append(2).append(" ");
            } else if (lvl >= 250) {
                sb.append(3).append(" ");
            } else {
                sb.append(4).append(" ");
            }
        }
        System.out.println(sb);
    }
}