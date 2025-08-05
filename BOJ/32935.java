import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long sum = 0;
        long max = Long.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            long cur = Long.parseLong(st.nextToken());
            sum += cur;
            max = Math.max(max, -cur);
        }

        System.out.println(Math.max(sum, max));
    }
}
