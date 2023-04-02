import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] k = new char[]{'K', 'O', 'R', 'E', 'A'};
        char[] y = new char[]{'Y', 'O', 'N', 'S', 'E', 'I'};
        int ki = 0;
        int yi = 0;

        for (int i = 0; i < str.length(); i++) {
            char now = str.charAt(i);

            if (now == k[ki]) {
                ki++;
            }

            if (ki == 5) {
                System.out.println("KOREA");
                return;
            }

            if (now == y[yi]) {
                yi++;
            }

            if (yi == 6) {
                System.out.println("YONSEI");
                return;
            }
        }
    }
}