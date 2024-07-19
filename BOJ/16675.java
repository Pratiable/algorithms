import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        String c = st.nextToken();
        String d = st.nextToken();

        if (canBeat(a, c, d) || canBeat(b, c, d)) {
            System.out.println("MS");
        } else if (canBeat(c, a, b) || canBeat(d, a, b)) {
            System.out.println("TK");
        } else {
            System.out.println("?");
        }
    }

    static boolean canBeat(String a, String b, String c) {
        if (a.equals("R")) {
            return b.equals("S") && c.equals("S");
        } else if (a.equals("S")) {
            return b.equals("P") && c.equals("P");
        } else {
            return b.equals("R") && c.equals("R");
        }
    }
}