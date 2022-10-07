import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = 0;
        int m = 0;
        for (int i = 0; i < n; i++) {
            int T = Integer.parseInt(st.nextToken());
            y += ((T / 30) + 1) * 10;
            m += ((T / 60) + 1) * 15;
        }

        if (y == m) {
            System.out.printf("Y M %d", y);
        } else if (y > m) {
            System.out.printf("M %d", m);
        } else {
            System.out.printf("Y %d", y);
        }
    }
}