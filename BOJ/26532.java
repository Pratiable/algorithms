import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int w = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        System.out.println((int) Math.ceil((double) (w * l) / 4840 / 5));
    }
}
