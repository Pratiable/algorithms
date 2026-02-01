import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] piles = new int[N];
        int sum = 0;
        int moved = 0;

        for (int i = 0; i < N; i++) {
            piles[i] = Integer.parseInt(br.readLine());
            sum += piles[i];
        }

        int avg = sum / N;

        for (int i = 0; i < N; i++) {
            if (piles[i] > avg) moved += piles[i] - avg;
        }

        System.out.print(moved);
    }
}
