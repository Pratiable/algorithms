import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int b = 0;
        int s = 0;
        int a = 0;

        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (c == 'B') {
                b++;
            } else if (c == 'S') {
                s++;
            } else if (c == 'A') {
                a++;
            }
        }

        int max = Math.max(b, Math.max(s, a));
        if (b == s && s == a) {
            System.out.println("SCU");
        } else {
            if (b == max) System.out.print('B');
            if (s == max) System.out.print('S');
            if (a == max) System.out.print('A');
        }
    }
}
