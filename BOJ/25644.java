import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = Integer.MAX_VALUE;
        int maxGain = 0;

        for (int i = 0; i < N; i++) {
            int stock = Integer.parseInt(st.nextToken());

            if (stock < min) {
                min = stock;
            } else {
                int gain = stock - min;

                if (gain > maxGain) {
                    maxGain = gain;
                }
            }
        }

        System.out.print(maxGain);
    }
}
