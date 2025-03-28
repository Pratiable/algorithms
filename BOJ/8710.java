import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long k = Long.parseLong(st.nextToken());
        long w = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        long r = (w - k + m - 1) / m;

        System.out.println(r);
    }
}
