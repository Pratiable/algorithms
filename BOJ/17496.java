import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int days = 1;
        int cnt = 0;

        while (days + T <= N) {
            cnt++;
            days += T;
        }

        System.out.print(C * P * cnt);
    }
}
