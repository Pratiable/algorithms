import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        float w = Integer.parseInt(st.nextToken());
        float h = Integer.parseInt(st.nextToken());

        System.out.printf("%.1f", w * h / 2);

    }
}
