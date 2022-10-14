import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int p = Integer.parseInt(br.readLine());

        int x, y;

        x = a * p;

        y = p > c ? b + (p - c) * d : b;

        System.out.println(Math.min(x, y));

        bw.flush();
        bw.close();
    }
}