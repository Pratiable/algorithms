import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        long sum = 0;

        for (int i = a; i <= b; i++) {
            if (i < 4) continue;
            if (i % 2 == 0) sum += i;
        }

        System.out.println(sum);
    }
}