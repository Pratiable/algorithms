import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int sum = n + m;

        int result = (n > m) ? Math.min(sum, m * 2 + 1) : Math.min(sum, n * 2 + 1);

        System.out.println(result);
    }
}
