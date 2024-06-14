import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] heights = new long[n];
        for (int i = 0; i < n; i++) {
            heights[i] = Long.parseLong(st.nextToken());
        }

        long area = heights[0] * 4 + 2;
        for (int i = 1; i < n; i++) {
            if (heights[i] > heights[i - 1]) {
                area += heights[i] * 4 + 2 - (heights[i - 1] * 2);
            } else {
                area += heights[i] * 4 + 2 - (heights[i] * 2);
            }
        }

        System.out.println(area);
    }
}