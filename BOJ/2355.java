import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());

        if (a == b) {
            bw.append(String.valueOf(a));
        } else if (a < b) {
            bw.append(String.valueOf((a + b) * (b - a + 1) / 2));
        } else {
            bw.append(String.valueOf((a + b) * (a - b + 1) / 2));
        }

        bw.flush();
        bw.close();
    }
}