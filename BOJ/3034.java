import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int d = (int) Math.sqrt((Math.pow(w, 2) + Math.pow(h, 2)));

        for (int i = 0; i < n; i++) {
            int match = Integer.parseInt(br.readLine());
            bw.append(match > d ? "NE\n" : "DA\n");
        }

        bw.flush();
        bw.close();
    }
}