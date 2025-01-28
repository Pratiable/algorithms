import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());

        int min = Integer.MAX_VALUE;
        int ax = 0;
        int ay = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int nx = Integer.parseInt(st.nextToken());
            int ny = Integer.parseInt(st.nextToken());
            int dist = Math.abs(x - nx) + Math.abs(y - ny);

            if (dist < min) {
                min = dist;
                ax = nx;
                ay = ny;
            }
        }

        System.out.println(ax + " " + ay);
    }
}