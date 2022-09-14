import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (m >= 45) {
            System.out.printf("%d %d", h, m - 45);
        } else {
            h--;
            System.out.printf("%d %d", h < 0 ? 23 : h, 60 + (m - 45));
        }
    }
}
