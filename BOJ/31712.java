import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cU = Integer.parseInt(st.nextToken());
        int dU = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int cD = Integer.parseInt(st.nextToken());
        int dD = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int cP = Integer.parseInt(st.nextToken());
        int dP = Integer.parseInt(st.nextToken());

        int H = Integer.parseInt(br.readLine());
        int time = 1;
        int hp = H - dU - dD - dP;

        if (hp <= 0) {
            System.out.println(0);
            return;
        }

        while (true) {
            int cur = 0;
            if (time % cU == 0) {
                cur += dU;
            }

            if (time % cD == 0) {
                cur += dD;
            }

            if (time % cP == 0) {
                cur += dP;
            }

            hp -= cur;

            if (hp <= 0) {
                System.out.println(time);
                break;
            }

            time++;
        }
    }
}
