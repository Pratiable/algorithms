import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int x1 = x % 4 == 0 ? x / 4 : (x / 4) + 1;
        int x2 = x % 4 == 0 ? 4 : x % 4;

        int y1 = y % 4 == 0 ? y / 4 : (y / 4) + 1;
        int y2 = y % 4 == 0 ? 4 : y % 4;

        System.out.println(Math.abs(x1 - y1) + Math.abs(x2 - y2));

        bw.flush();
        bw.close();
    }
}
