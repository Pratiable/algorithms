import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int asc = 0;
        int start = Integer.parseInt(st.nextToken());
        int prev = start;

        while (st.hasMoreTokens()) {
            int now = Integer.parseInt(st.nextToken());
            asc = Math.max(asc, now - start);
            if (prev >= now) {
                start = now;
            }
            prev = now;
        }
        System.out.println(asc);

        bw.flush();
        bw.close();
    }
}