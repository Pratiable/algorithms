import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h1 = Integer.parseInt(st.nextToken());
        int b1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int h2 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());

        int a = h1 * 3 + b1;
        int b = h2 * 3 + b2;

        if (a > b) {
            System.out.printf("1 %d", a - b);
        } else if (b > a) {
            System.out.printf("2 %d", b - a);
        } else {
            System.out.println("NO SCORE");
        }
    }
}
