import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            br.readLine();
            st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int su = Integer.parseInt(st.nextToken());
            int sa = Integer.parseInt(st.nextToken());
            int f = Integer.parseInt(st.nextToken());
            int minPancake = (int) Math.floor(Math.min((double) c / 8, Math.min((double) y / 8, Math.min((double) su / 4, Math.min(sa, (double) f / 9)))) * 16);

            st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            int gs = Integer.parseInt(st.nextToken());
            int gc = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int total = b + gs / 30 + gc / 25 + w / 10;

            sb.append(Math.min(minPancake, total)).append("\n");
        }


        System.out.println(sb);
    }
}
