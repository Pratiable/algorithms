import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> arr = new ArrayList<>(9);
        int max = 0;
        for (int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine());
            arr.add(num);
            max = Math.max(max, num);
        }

        bw.append(String.valueOf(max)).append("\n");
        bw.append(String.valueOf(arr.indexOf(max) + 1));

        bw.flush();
        bw.close();
    }
}