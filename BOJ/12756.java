import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int aa = Integer.parseInt(st.nextToken());
        int ah = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int ba = Integer.parseInt(st.nextToken());
        int bh = Integer.parseInt(st.nextToken());

        while (ah > 0 && bh > 0) {
            ah -= ba;
            bh -= aa;
        }

        if (ah <= 0 && bh <= 0) {
            System.out.println("DRAW");
        } else if (ah > 0) {
            System.out.println("PLAYER A");
        } else {
            System.out.println("PLAYER B");
        }
    }
}