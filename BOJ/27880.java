import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int height = 0;
        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "Es":
                    height += Integer.parseInt(st.nextToken()) * 21;
                    break;
                default:
                    height += Integer.parseInt(st.nextToken()) * 17;
                    break;
            }
        }
        System.out.println(height);
    }
}
