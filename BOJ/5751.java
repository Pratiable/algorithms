import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = 0;
            int j = 0;

            for (int i = 0; i < n; i++) {
                if (Integer.parseInt(st.nextToken()) == 0) {
                    m++;
                } else {
                    j++;
                }
            }

            sb.append(String.format("Mary won %d times and John won %d times\n", m, j));
        }

        System.out.println(sb);
    }
}