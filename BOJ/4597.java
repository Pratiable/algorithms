import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        while (true) {
            str = br.readLine();
            if (str.equals("#")) break;

            boolean isOdd = str.charAt(str.length() - 1) == 'o';
            int oneCnt = 0;

            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == '1') oneCnt++;
            }

            sb.append(str, 0, str.length() - 1);

            if (isOdd) {
                sb.append(oneCnt % 2 == 1 ? '0' : '1').append("\n");
            } else {
                sb.append(oneCnt % 2 == 1 ? '1' : '0').append("\n");
            }
        }

        System.out.print(sb);
    }
}
