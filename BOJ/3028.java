import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String seq = br.readLine();
        int ball = 0;

        for (int i = 0; i < seq.length(); i++) {
            char ch = seq.charAt(i);
            
            if (ch == 'A') {
                ball = ball == 0 ? 1 : ball == 1 ? 0 : 2;
            } else if (ch == 'B') {
                ball = ball == 1 ? 2 : ball == 2 ? 1 : 0;
            } else {
                ball = ball == 0 ? 2 : ball == 2 ? 0 : 1;
            }
        }

        System.out.print(ball + 1);
    }
}
