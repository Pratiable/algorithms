import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer sto = new StringTokenizer(br.readLine());
        long mOverseer = Long.parseLong(sto.nextToken());
        long sOverseer = Long.parseLong(sto.nextToken());
        long needOverseers = 0;

        for (int i = 0; i < n; i++) {
            long candidates = Long.parseLong(st.nextToken());
            candidates -= mOverseer;
            needOverseers++;
            if (candidates > 0) {
                needOverseers += candidates <= sOverseer
                        ? 1
                        : candidates % sOverseer == 0
                        ? candidates / sOverseer
                        : candidates / sOverseer + 1;
            }
        }

        System.out.println(needOverseers);
    }
}
