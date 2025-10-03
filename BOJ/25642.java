import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        while (true) {
            b += a;
            if (b >= 5) {
                System.out.println("yt");
                return;
            }

            a += b;
            if (a >= 5) {
                System.out.println("yj");
                return;
            }
        }
    }
}
