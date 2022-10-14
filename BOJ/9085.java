import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int result = 0;
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                result += Integer.parseInt(st.nextToken());
            }
            bw.append(String.valueOf(result)).append("\n");
        }

        bw.flush();
        bw.close();
    }
}