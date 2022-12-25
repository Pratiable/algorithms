import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] goms = new long[3];
        long[] tickets = new long[3];
        goms[0] = Long.parseLong(st.nextToken());
        goms[1] = Long.parseLong(st.nextToken());
        goms[2] = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());

        tickets[0] = Long.parseLong(st.nextToken());
        tickets[1] = Long.parseLong(st.nextToken());
        tickets[2] = Long.parseLong(st.nextToken());

        long can = 0;

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                if (goms[i] - tickets[i] >= 0) {
                    can += tickets[i];
                    goms[i] -= tickets[i];
                    tickets[i] = 0;
                } else if (goms[i] - tickets[i] < 0) {
                    can += goms[i];
                    tickets[i] -= goms[i];
                    goms[i] = 0;
                    int nextIdx = i == 2 ? 0 : i + 1;
                    tickets[nextIdx] += (tickets[i] - goms[i]) / 3;
                    tickets[i] = (tickets[i] - goms[i]) % 3;
                }
            }
        }

        System.out.println(can);
    }
}