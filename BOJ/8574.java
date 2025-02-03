import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int sq = k * k;
        int cnt = 0;

        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int nx = Integer.parseInt(st.nextToken()) - x;
            int ny = Integer.parseInt(st.nextToken()) - y;
            int dist = nx * nx + ny * ny;
            if (dist > sq) cnt++;
        }

        System.out.println(cnt);
    }
}