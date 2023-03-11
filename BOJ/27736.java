import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = 0;
        int r = 0;
        int inv = 0;

        for (int i = 0; i < n; i++) {
            switch (st.nextToken()) {
                case "1":
                    a++;
                    break;
                case "0":
                    inv++;
                    break;
                case "-1":
                    r++;
                    break;
            }
        }

        System.out.println(inv >= a + r ? "INVALID" : r >= a ? "REJECTED" : "APPROVED");
    }
}