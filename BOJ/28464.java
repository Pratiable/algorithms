import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] dishes = new int[n];
        int a = 0;
        int b = 0;

        for (int i = 0; i < n; i++) {
            dishes[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(dishes);
        for (int i = 0; i < n / 2; i++) {
            a += dishes[i];
        }

        for (int i = n / 2; i < n; i++) {
            b += dishes[i];
        }

        System.out.printf("%d %d", a, b);
    }
}
