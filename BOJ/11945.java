import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb;
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            sb = new StringBuffer(br.readLine());
            bw.append(sb.reverse().toString()).append("\n");
        }

        bw.flush();
        bw.close();
    }
}