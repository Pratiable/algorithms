import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] ans = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            ans[i] = Integer.parseInt(st.nextToken());
        }

        int score = 0;
        int adds = 0;

        for (int i = 0; i < n; i++) {
            if (ans[i] == 1) {
                score += 1 + adds;
                adds++;
            } else {
                adds = 0;
            }
        }

        System.out.println(score);
    }
}