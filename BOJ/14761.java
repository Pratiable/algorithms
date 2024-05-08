import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            sb.append((i % x == 0 && i % y == 0 ? "FizzBuzz": i % x == 0 ? "Fizz" : i % y == 0 ? "Buzz" : i) + "\n");
        }

        System.out.println(sb);
    }
}