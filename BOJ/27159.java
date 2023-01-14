import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = Integer.parseInt(st.nextToken());
        int tmp = sum;

        while(st.hasMoreTokens()) {
            int now = Integer.parseInt(st.nextToken());
            if (now - 1 != tmp) {
                sum += now;
            }
            tmp = now;
        }
        System.out.println(sum);
    }
}