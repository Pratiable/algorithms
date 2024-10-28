import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        long res = 1;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            long next = Long.parseLong(st.nextToken());
            res = (res * next) % m;
        }

        System.out.println(res);
    }
}