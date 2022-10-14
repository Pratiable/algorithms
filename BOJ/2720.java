import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] coinValues = new int[]{25, 10, 5, 1};

        for (int i = 0; i < n; i++) {
            int change = Integer.parseInt(br.readLine());
            int[] coinCounts = new int[]{0, 0, 0, 0};

            for (int j = 0; j < coinValues.length; j++) {
                coinCounts[j] += change / coinValues[j];
                change = change % coinValues[j];
            }
            bw.append(String.join(" ", Arrays.stream(coinCounts).mapToObj(String::valueOf).toArray(String[]::new))).append("\n");
        }

        bw.flush();
        bw.close();
    }
}