import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int dist = Math.abs(a - b);

        System.out.println(Math.min(dist, Math.min(Math.abs(a - x) + Math.abs(y - b), Math.abs(a - y) + Math.abs(x - b))));
    }
}