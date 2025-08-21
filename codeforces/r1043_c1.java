import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        long[] costs = new long[20];
        long front = 1;
        long back = 1;
        costs[0] = 3;

        for (int i = 1; i < 20; i++) {
            back = front;
            front *= 3;
            costs[i] = front * 3 + i * back;
        }

        for (int tc = 0; tc < t; tc++) {
            long n = Long.parseLong(br.readLine());
            long cost = 0;

            for (int i = 0; n > 0; i++) {
                cost += n % 3L * costs[i];
                n /= 3;
            }

            sb.append(cost).append("\n");
        }

        System.out.println(sb);
    }
}
