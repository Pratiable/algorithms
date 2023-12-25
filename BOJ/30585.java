import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        
        int sum = 0;

        for (int i = 0; i < h; i++) {
            String str = br.readLine();
            for (int j = 0; j < w; j++) {
                if (str.charAt(j) == '1') {
                    sum++;
                }
            }
        }

        System.out.println(Math.min(h * w - sum, sum));
    }
}
