import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;
        int availableKillCount = 0;
        int prev = Integer.parseInt(st.nextToken());
        int start = prev;

        while(st.hasMoreTokens()) {
            int now = Integer.parseInt(st.nextToken());
            if (now < start) {
                availableKillCount++;
            } else {
                start = now;
                availableKillCount = 0;
            }
            result = Math.max(result, availableKillCount);
            prev = now;
        }
        System.out.println(result);
    }
}