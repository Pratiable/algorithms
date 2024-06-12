import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a.append(st1.nextToken());
            b.append(st2.nextToken());
        }

        long x = Long.parseLong(a.toString());
        long y = Long.parseLong(b.toString());

        System.out.println(Math.min(x, y));
    }
}