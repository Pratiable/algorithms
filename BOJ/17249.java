import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int start = str.indexOf('(');
        int end = start + 5;
        int lCnt = 0;
        int rCnt = 0;

        for (int i = 0; i < start; i++) {
            if (str.charAt(i) == '@') lCnt++;
        }

        for (int i = end; i < str.length(); i++) {
            if (str.charAt(i) == '@') rCnt++;
        }

        System.out.print(lCnt + " " + rCnt);
    }
}
