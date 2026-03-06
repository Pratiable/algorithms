import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int b1 = Integer.parseInt(st.nextToken());
        int a2 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int c1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int c2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());

        double g = (a1 + b1) / 2.0 + (a2 + b2) / 2.0;
        double e = (c1 + d1) / 2.0 + (c2 + d2) / 2.0;

        System.out.print(g > e ? "Gunnar" : g < e ? "Emma" : "Tie");
    }
}
