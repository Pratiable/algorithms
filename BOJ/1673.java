import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;

        while ((str = br.readLine()) != null) {
            if (str.isEmpty()) continue;

            st = new StringTokenizer(str);
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int coupon = n;
            int stamp = 0;
            int ordered = 0;

            while (coupon > 0) {
                ordered += coupon;
                stamp += coupon;
                coupon = stamp / k;
                stamp %= k;
            }

            sb.append(ordered).append("\n");
        }

        System.out.print(sb);
    }
}
