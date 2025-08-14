import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        int M = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int totalSeconds = M * 60 + S;

        if (totalSeconds % 60 == 0) {
            System.out.println(M / 10 + M % 10 + 1);
        } else if (totalSeconds % 60 >= 30) {
            System.out.println(M / 10 + M % 10 + 1 + (S % 30 / 10));
        } else {
            System.out.println(M / 10 + M % 10 + S / 10 + 1);
        }
    }
}
