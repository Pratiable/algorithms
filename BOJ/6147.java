import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int sum = 0;
        int count = 0;
        int[] heights = new int[N];

        for (int i = 0; i < N; i++) {
            heights[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(heights);

        for (int i = N - 1; i >= 0; i--) {
            sum += heights[i];
            count++;

            if (sum >= B) {
                break;
            }
        }

        System.out.print(count);
    }
}
