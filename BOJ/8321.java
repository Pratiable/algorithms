import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int sum = 0;
        int cnt = 0;
        int[] screws = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            screws[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(screws);

        for (int i = n - 1; i >= 0; i--) {
            sum += screws[i];
            cnt++;

            if (sum >= s * k) break;
        }

        System.out.print(cnt);
    }
}
