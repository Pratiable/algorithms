import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            long p = Long.parseLong(st.nextToken());
            long t = Long.parseLong(st.nextToken());

            long d = t / 7;
            long b = t / 4;

            long population = p + b - d;
            sb.append(population).append('\n');
        }
        System.out.println(sb);
    }
}
