import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int meals = 0;
        int remain = 0;

        for (int i = 0; i < N; i++) {
            int cur = Integer.parseInt(st.nextToken());
            meals += cur / X;
            remain += Math.max(0, cur - (cur / X) * Y);
        }

        System.out.printf("%d\n%d", meals, remain);
    }
}