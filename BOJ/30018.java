import java.io.*;
import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        int[] b = new int[n];

        st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st2.nextToken());
        }

        int move = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] > b[i]) {
                move += a[i] - b[i];
            }
        }

        System.out.println(move);
    }
}
