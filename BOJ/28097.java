import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = -8;

        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(st.nextToken()) + 8;
        }

        System.out.printf("%d %d", sum / 24, sum % 24);
    }
}