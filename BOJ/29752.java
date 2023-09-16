import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        int temp = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            if (st.nextToken().equals("0")) {
                max = Math.max(max, temp);
                temp = 0;
            } else {
                temp++;
            }
        }

        System.out.println(Math.max(max, temp));
    }
}
