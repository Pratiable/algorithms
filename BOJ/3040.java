import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] list = new int[9];

        for (int i = 0; i < 9; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

        int sum = Arrays.stream(list).sum();

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (sum - (list[i] + list[j]) == 100) {
                    for (int k = 0; k < list.length; k++) {
                        if (k == i || k == j) continue;
                        bw.append(String.valueOf(list[k])).append("\n");
                    }
                }
            }
        }
        bw.flush();
        bw.close();
    }
}