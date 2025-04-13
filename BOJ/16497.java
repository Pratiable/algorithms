import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] days = new int[32];
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            for (int j = start; j < end; j++) days[j]++;
        }

        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < 32; i++) {
            if (days[i] > k) {
                System.out.println(0);
                return;
            }
        }

        System.out.println(1);
    }
}