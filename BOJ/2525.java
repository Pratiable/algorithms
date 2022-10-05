import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());

        int m = b + c;
        int h = a;

        if (m >= 60) {
            h += m / 60;
            m %= 60;
        }

        System.out.printf("%d %d", h % 24, m);
    }
}