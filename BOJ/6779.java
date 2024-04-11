import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int h = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        for (int i = 1; i < m; i++) {
            if (((-6 * Math.pow(i, 4)) + (h * Math.pow(i, 3)) + (2 * Math.pow(i, 2)) + i) <= 0) {
                System.out.printf("The balloon first touches ground at hour: %d", i);
                return;
            }
        }

        System.out.println("The balloon does not touch ground in the given time.");
    }
}
