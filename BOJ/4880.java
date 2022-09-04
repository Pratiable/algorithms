import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) break;

            if (b - a == c - b) {
                bw.append("AP ").append(String.valueOf(c + (b - a))).append("\n");
            } else {
                bw.append("GP ").append(String.valueOf(c * (c / b))).append("\n");
            }
        }

        bw.flush();
        bw.close();
    }
}