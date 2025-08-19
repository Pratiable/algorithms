import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int usedBattery = 0;
        int prev = 0;
        int cur = 0;

        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(st.nextToken());
            int amount = cur == A ? prev * 2 : 2;

            if (usedBattery + amount >= 100) {
                usedBattery = 0;
                prev = 0;
                cur = 0;
                continue;
            }

            usedBattery += amount;
            prev = amount;
            cur = A;
        }

        System.out.println(usedBattery);
    }
}
