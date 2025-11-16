import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] trophies = new int[N];
        int max = 0;
        int left = 0;
        int right = 0;

        for (int i = 0; i < N; i++) {
            trophies[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < N; i++) {
            if (trophies[i] > max) {
                left++;
                max = trophies[i];
            }
        }
        max = 0;

        for (int i = N - 1; i >= 0; i--) {
            if (trophies[i] > max) {
                right++;
                max = trophies[i];
            }
        }

        System.out.println(left);
        System.out.println(right);
    }
}
