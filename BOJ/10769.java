import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int hCnt = 0;
        int sCnt = 0;

        for (int i = 0; i <= str.length() - 3; i++) {
            String cur = str.substring(i, i + 3);
            
            if (cur.equals(":-)")) {
                hCnt++;
            } else if (cur.equals(":-(")) {
                sCnt++;
            }
        }

        if (hCnt == 0 && sCnt == 0) {
            System.out.print("none");
        } else if (hCnt == sCnt) {
            System.out.print("unsure");
        } else if (hCnt > sCnt) {
            System.out.print("happy");
        } else {
            System.out.print("sad");
        }
    }
}
