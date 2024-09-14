import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        int n = 1;
        int now = c;

        while (now != 1) {
            if (now % 2 == 0) {
                now = now / 2;
            } else {
                now = 3 * now + 1;
            }
            n++;
        }

        System.out.println(n);
    }
}
