import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < t; tc++) {
            long n = Long.parseLong(br.readLine());
            List<Long> list = new ArrayList<>();

            long acc = 10;

            for (int i = 1; i <= 18; i++) {
                long addedNum = acc + 1;

                if (n % addedNum == 0) {
                    list.add(n / addedNum);
                }

                acc *= 10;
            }

            if (list.isEmpty()) {
                sb.append(0).append("\n");
                continue;
            }

            Collections.sort(list);
            sb.append(list.size()).append("\n");

            for (long num: list) {
                sb.append(num).append(" ");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
