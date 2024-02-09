import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ds = Integer.parseInt(st.nextToken());
        int ys = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int dm = Integer.parseInt(st.nextToken());
        int ym = Integer.parseInt(st.nextToken());

        int y = 0;
        while (true) {
            if ((y + ds) % ys == 0 && (y + dm) % ym == 0) {
                break;
            }
            y++;
        }

        System.out.println(y);
    }
}