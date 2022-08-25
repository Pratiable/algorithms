import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());

        if (Math.abs(L - R) >= A) {
            System.out.println(L > R ? ((R + A) * 2) : ((L + A) * 2));
        } else if (L == R) {
            System.out.println(L + R + (A / 2) * 2);
        } else {
            System.out.println((L + R + A) / 2 * 2);
        }
    }
}