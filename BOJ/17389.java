import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        int result = 0;
        int add = 0;

        for (int i = 0; i < N; i++) {
            char cur = S.charAt(i);

            if (cur == 'O') {
                result += i + add + 1;
                add++;
            } else {
                add = 0;
            }
        }

        System.out.print(result);
    }
}
