import java.io.*;

public class Main {
    static int n;
    static int[] d = new int[301];
    static int[] scores;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        scores = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }

        if (n == 1) {
            System.out.println(scores[1]);
            return;
        }

        if (n == 2) {
            System.out.println(scores[1] + scores[2]);
            return;
        }

        d[1] = scores[1];
        d[2] = scores[1] + scores[2];
        d[3] = Math.max(scores[1] + scores[3], scores[2] + scores[3]);

        for (int i = 4; i < n + 1; i++) {
            d[i] = Math.max(d[i - 2] + scores[i], d[i - 3] + scores[i - 1] + scores[i]);
        }


        System.out.println(d[n]);
    }
}