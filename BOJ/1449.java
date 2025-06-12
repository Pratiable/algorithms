import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int count = 0;
        int margin = l - 1;

        st = new StringTokenizer(br.readLine());
        int[] holes = new int[n];

        for (int i = 0; i < n; i++) {
            holes[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(holes);

        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                count++;
                break;
            }
            int nextGap = holes[i + 1] - holes[i];
            if (nextGap > margin) {
                count++;
                margin = l - 1;
            } else {
                margin -= nextGap;
            }
        }

        System.out.println(count);
    }
}
