import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int startH = Integer.parseInt(st.nextToken());
            int startM = Integer.parseInt(st.nextToken());
            int startS = Integer.parseInt(st.nextToken());
            int endH = Integer.parseInt(st.nextToken());
            int endM = Integer.parseInt(st.nextToken());
            int endS = Integer.parseInt(st.nextToken());
            int workedH, workedM, workedS;
//
            if (startS > endS) {
                workedS = 60 + (endS - startS);
                startM++;
            } else {
                workedS = endS - startS;
            }

            if (startM >= 60) {
                startM %= 60;
                startH++;
            }

            if (startM > endM) {
                workedM = 60 + (endM - startM);
                startH++;
            } else {
                workedM = endM - startM;
            }

            workedH = endH - startH;

            bw.append(String.format("%d %d %d\n", workedH, workedM, workedS));
        }
        bw.flush();
        bw.close();
    }
}