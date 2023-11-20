import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());

            if (w == 136) {
                sum += 1000;
            } else if (w == 142) {
                sum += 5000;
            } else if (w == 148) {
                sum += 10000;
            } else if (w == 154) {
                sum += 50000;
            }
        }

        System.out.println(sum);
    }
}
