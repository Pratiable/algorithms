import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        List<Integer> arr = new ArrayList<>(5);
        int max = 0;
        for (int i = 0; i < 5; i++) {
            int num = 0;
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                num += Integer.parseInt(st.nextToken());
            }
            arr.add(num);
            max = Math.max(max, num);
        }

        bw.append(String.valueOf(arr.indexOf(max) + 1)).append(" ").append(String.valueOf(max));

        bw.flush();
        bw.close();
    }
}