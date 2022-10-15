import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] seats = new int[101];
        int rejectCount = 0;

        while (st.hasMoreTokens()) {
            int requestSeat = Integer.parseInt(st.nextToken());
            if (seats[requestSeat] == 1) {
                rejectCount++;
            } else {
                seats[requestSeat] = 1;
            }
        }

        bw.append(String.valueOf(rejectCount));

        bw.flush();
        bw.close();
    }
}