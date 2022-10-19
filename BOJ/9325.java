import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int total = Integer.parseInt(br.readLine());
            int options = Integer.parseInt(br.readLine());
            for (int j = 0; j < options; j++) {
                st = new StringTokenizer(br.readLine());
                int optionCounts = Integer.parseInt(st.nextToken());
                int optionPrice = Integer.parseInt(st.nextToken());
                total += optionCounts * optionPrice;
            }
            bw.append(String.valueOf(total)).append("\n");
        }

        bw.flush();
        bw.close();
    }
}