import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int K = 1;
        int idx = -1;

        for (int i = 0; i < S.length(); i++) {
            int alp = S.charAt(i) - 'a';

            if (alp <= idx) K++;
            idx = alp;
        }

        System.out.print(K);
    }
}
