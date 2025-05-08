import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        double min = (double) (x * 1000) / y;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int xi = Integer.parseInt(st.nextToken());
            int yi = Integer.parseInt(st.nextToken());
            min = Math.min(min, (double) (xi * 1000) / yi);
        }

        System.out.printf("%.2f%n", min);
    }
}
