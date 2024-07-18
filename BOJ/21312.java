import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int res = 1;

        if (a % 2 != 0) res *= a;
        if (b % 2 != 0) res *= b;
        if (c % 2 != 0) res *= c;
        if (!(a == 1 || b == 1 || c == 1) &&res == 1) res = a * b * c;

        System.out.println(res);
    }
}