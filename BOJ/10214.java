import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int y = 0;
            int k = 0;
            for (int j = 0; j < 9; j++) {
                st = new StringTokenizer(br.readLine());
                y += Integer.parseInt(st.nextToken());
                k += Integer.parseInt(st.nextToken());
            }
            bw.append(y > k ? "Yonsei" : k > y ? "Korea" : "Draw").append("\n");
        }

        bw.flush();
        bw.close();
    }
}