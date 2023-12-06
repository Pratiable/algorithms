import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);

        for (int t = 0; t < n; t++) {
            if (x % 2 == 0) {
                x = (x / 2) ^ 6;
            } else {
                x = (2 * x) ^ 6;
            }
        }

        System.out.println(x);
    }
}
