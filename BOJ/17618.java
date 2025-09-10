import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 1; i <= N; i++) {
            int cur = i;
            int sum = 0;

            while (cur > 0) {
                sum += cur % 10;
                cur /= 10;
            }

            if (i % sum == 0) cnt++;
        }

        System.out.println(cnt);
    }
}
