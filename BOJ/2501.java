import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] divisors = new int[n + 1];

        Arrays.fill(divisors, 0);

        for (int i = 1; i < n + 1; i++) {
            if(n % i == 0) divisors[i] = 1;
        }

        for (int i = 1; i < divisors.length; i++) {
            if (divisors[i] == 1) {
                if (k == 1) {
                    System.out.println(i);
                    return;
                }
                k--;
            }
        }
        System.out.println(0);

    }
}