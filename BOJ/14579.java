import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        long sum;
        long std = 0;
        for (int i = 0; i < a + 1; i++) {
            std += i;
        }
        sum = std % 14579;

        for (int i = a + 1; i < b + 1; i++) {
            std += i;
            sum = sum * std % 14579;
        }

        System.out.println(sum);
    }
}