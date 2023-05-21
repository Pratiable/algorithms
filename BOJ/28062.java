import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] candies = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            candies[i] = Integer.parseInt(st.nextToken());
            sum += candies[i];
        }

        if (sum % 2 == 0) {
            System.out.println(sum);
            return;
        }

        Arrays.sort(candies);

        for (int i = 0; i < n; i++) {
            if (candies[i] % 2 == 1) {
                System.out.println(sum - candies[i]);
                return;
            }
        }

        System.out.println(0);
    }
}