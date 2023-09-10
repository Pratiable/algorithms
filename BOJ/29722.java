import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");

        int y = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int add = Integer.parseInt(br.readLine());

        int nd = d + add;
        d = nd;
        if (nd > 30) {
            m += nd % 30 == 0 ? (nd / 30) - 1 : nd / 30;
            d = nd % 30 == 0 ? 30 : nd % 30;
        }

        int nm = m;

        if (nm > 12) {
            y += nm % 12 == 0 ? (nm / 12) - 1 : nm / 12;
            m = nm % 12 == 0 ? 12 : nm % 12;
        }

        System.out.printf("%s-%s-%s", y, String.valueOf(m).length() == 1 ? "0" + m : m, String.valueOf(d).length() == 1 ? "0" + d : d);
    }
}
