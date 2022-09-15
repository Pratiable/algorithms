import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double x = Double.parseDouble(st.nextToken());
        double y = Double.parseDouble(st.nextToken());
        double z = Double.parseDouble(st.nextToken());
        double a, b, c;

        c = (y + z - x) / 2;
        a = y - c;
        b = z - c;

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println(-1);
        } else {
            System.out.println(1);
            System.out.printf("%.1f %.1f %.1f", a, b, c);
        }
    }
}