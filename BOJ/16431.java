import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int bx = Integer.parseInt(st.nextToken());
        int by = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int dx = Integer.parseInt(st.nextToken());
        int dy = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int jx = Integer.parseInt(st.nextToken());
        int jy = Integer.parseInt(st.nextToken());

        int bDist = Math.max(Math.abs(bx - jx), Math.abs(by - jy));
        int dDist = Math.abs(dx - jx) + Math.abs(dy - jy);

        System.out.println(bDist < dDist ? "bessie" : bDist > dDist ? "daisy" : "tie");
    }
}
