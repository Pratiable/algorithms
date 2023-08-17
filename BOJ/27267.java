import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int m = a * b;
        int p = c * d;

        if (m > p) {
            System.out.println("M");
        } else if (m < p) {
            System.out.println("P");
        } else {
            System.out.println("E");
        }
    }
}
