import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] times = new String[8];
        int[] scores = new int[]{10, 8, 6, 5, 4, 3, 2, 1};
        int r = 0, b = 0;
        for (int i = 0; i < 8; i++) {
            times[i] = br.readLine();
        }

        Arrays.sort(times);

        for (int i = 0; i < 8; i++) {
            String s = times[i].split(" ")[1];

            if (Objects.equals(s, "B")) {
                b += scores[i];
            } else {
                r += scores[i];
            }
        }

        System.out.println(b > r ? "Blue" : "Red");
    }
}
