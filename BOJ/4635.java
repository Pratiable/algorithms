import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;
            int sum = 0;
            int prevHour = 0;

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int mile = Integer.parseInt(st.nextToken());
                int hour = Integer.parseInt(st.nextToken());
                sum += mile * (hour - prevHour);
                prevHour = hour;
            }

            sb.append(sum).append(" miles\n");
        }

        System.out.println(sb);
    }
}